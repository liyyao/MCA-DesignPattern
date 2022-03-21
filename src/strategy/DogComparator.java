package strategy;

public class DogComparator implements Comparator<Dog04> {


    @Override
    public int compare(Dog04 o1, Dog04 o2) {
        if (o1.food < o2.food) {
            return -1;
        }
        if (o1.food > o2.food) {
            return 1;
        }
        return 0;
    }
}
