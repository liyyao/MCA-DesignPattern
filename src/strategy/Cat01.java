package strategy;

public class Cat01 {

    private int weight;

    private int height;

    public Cat01(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat01 c) {
        if (this.weight < c.weight) {
            return -1;
        } else if (this.weight > c.weight) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
