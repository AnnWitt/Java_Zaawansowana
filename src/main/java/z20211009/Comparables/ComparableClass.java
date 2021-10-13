package z20211009.Comparables;

public class ComparableClass implements Comparable {
    int value;

    public ComparableClass(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        ComparableClass other=(ComparableClass) o;
        return Integer.compare(this.value,other.value);
    }
}
