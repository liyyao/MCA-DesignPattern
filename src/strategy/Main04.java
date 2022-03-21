package strategy;

import java.util.Arrays;

public class Main04 {

    public static void main(String[] args) {
        Cat04[] a = {new Cat04(3, 2), new Cat04(5, 1), new Cat04(1, 5)};
        Dog04[] d = {new Dog04(3), new Dog04(5), new Dog04(1)};
        Sorter04<Cat04> sorter1 = new Sorter04<>();
        Sorter04<Dog04> sorter2 = new Sorter04<>();
        sorter1.sort(a, new CatHeightComparator());
        sorter2.sort(d, new DogComparator());
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(d));
    }
}
