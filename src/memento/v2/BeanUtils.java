package memento.v2;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {

    /**
     * 备份bean的所有属性及属性值
     * @param bean
     * @return
     */
    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            //获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : descriptors) {
                //属性名称
                String fieldName = des.getName();
                //读取属性的方法
                Method getter = des.getReadMethod();
                //读属性值
                Object fieldValue = getter.invoke(bean);
                if (!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName, fieldValue);
                }
            }
        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 将备份的bean的值返回到bean中
     * @param bean
     * @param proMap
     */
    public static void restoreProp(Object bean, HashMap<String, Object> proMap) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : descriptors) {
                String fieldName = des.getName();
                if (proMap.containsKey(fieldName)) {
                    Method setter = des.getWriteMethod();
                    setter.invoke(bean, proMap.get(fieldName));
                }
            }
        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
