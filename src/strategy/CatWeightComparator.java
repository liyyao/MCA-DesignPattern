package strategy;

public class CatWeightComparator implements Comparator<Cat04> {
    @Override
    public int compare(Cat04 o1, Cat04 o2) {
        if (o1.weight < o2.weight) {
            return -1;
        }
        if (o1.weight > o2.weight) {
            return 1;
        }
        return 0;
    }
}
