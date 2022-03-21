package strategy;

public class Main01 {

    public static void main(String[] args) {
        Cat01[] a = {new Cat01(3, 3), new Cat01(5, 5), new Cat01(1, 1)};
        Sorter01 sorter = new Sorter01();
        sorter.sort(a);
        for (Cat01 c : a) {
            System.out.println(c);
        }
    }
}
