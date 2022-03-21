package strategy;

public class Dog03 implements Comparable03<Dog03> {

    int food;

    public Dog03(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog03 d) {
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
