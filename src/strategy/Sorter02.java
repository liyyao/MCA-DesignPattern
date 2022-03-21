package strategy;

/**
 * 相较于Sorter01，这里用了一个比较接口，以后要排序的事物，只需要实现Comparable接口即可
 * 但每次实现接口的子类，都需要将Comparable接口中compareTo的参数Object进行强制类型转换，也不太方便
 * 可以参考java泛型的写法
 */
public class Sorter02 {

    public static void sort(Comparable02[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for (int j=i+1; j<arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private static void swap(Comparable02[] arr, int i, int j) {
        Comparable02 temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
