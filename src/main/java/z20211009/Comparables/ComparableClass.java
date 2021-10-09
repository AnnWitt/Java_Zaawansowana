package z20211009.Comparables;

import java.util.Comparator;

public class ComparableClass implements Comparable {
    int field;

    public ComparableClass(int field) {
        this.field = field;
    }

    @Override
    public int compareTo(Object o) {
        ComparableClass other=(ComparableClass) o;
        return Integer.compare(this.field,other.field);
    }
}
