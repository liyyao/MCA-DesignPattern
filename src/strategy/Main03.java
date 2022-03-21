package strategy;

import java.util.Arrays;

public class Main03 {

    public static void main(String[] args) {
        Cat03[] a = {new Cat03(3, 3), new Cat03(5, 5), new Cat03(1, 1)};
        Dog03[] d = {new Dog03(3), new Dog03(5), new Dog03(1)};
        Sorter03 sorter = new Sorter03();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
