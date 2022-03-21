package strategy;

import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {
        //Cat02[] a = {new Cat02(3, 3), new Cat02(5, 5), new Cat02(1, 1)};
        Dog02[] a = {new Dog02(3), new Dog02(5), new Dog02(1)};
        Sorter02 sorter = new Sorter02();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
