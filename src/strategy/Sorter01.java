package strategy;

/**
 * 这里把排序的类型写死了，如果后期需要对其他事物排序，这里得加新方法，不够灵活
 */
public class Sorter01 {

    public static void sort(Cat01[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for (int j=i+1; j<arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private static void swap(Cat01[] arr, int i, int j) {
        Cat01 temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
