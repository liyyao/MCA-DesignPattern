package strategy;

public class Dog02 implements Comparable02 {

    int food;

    public Dog02(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Object o) {
        Dog02 d = (Dog02) o;
        if (this.food < d.food) {
            return -1;
        }
        if (this.food > d.food) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Dog02{" +
                "food=" + food +
                '}';
    }
}
