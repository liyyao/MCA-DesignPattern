package strategy;

public class CatHeightComparator implements Comparator<Cat04> {
    @Override
    public int compare(Cat04 o1, Cat04 o2) {
        if (o1.height < o2.height) {
            return -1;
        }
        if (o1.height > o2.height) {
            return 1;
        }
        return 0;
    }
}
