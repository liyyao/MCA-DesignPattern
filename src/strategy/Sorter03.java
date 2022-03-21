package strategy;

/**
 * 参考java泛型的写法
 * 但这里还不够灵活，因为实现接口的事物实现了接口的compareTo的方法，这里只对一个属性进行了比较，如果以后要对另一个属性进行排序，就得修改事务的compareTo方法
 * 这样就对修改开放了，考虑策略模式 comparator
 */
public class Sorter03 {

    public static void sort(Comparable03[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for (int j=i+1; j<arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private static void swap(Comparable03[] arr, int i, int j) {
        Comparable03 temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
