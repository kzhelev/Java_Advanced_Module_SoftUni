package IteratorsAndComparators.FroggyFirstVersion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    public class Frog implements Iterator<Integer> {

        int index = -2;

        @Override
        public boolean hasNext() {
            if (index + 2 >= list.size() && index % 2 == 0) {
                index = -1;
            }
            return index + 2 < list.size();
        }

        @Override
        public Integer next() {
            index += 2;
            return list.get(index);
        }

    }

    private List<Integer> list;

    public Lake() {
        list = new ArrayList<>();
    }

    public void add(int number) {
        list.add(number);
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }
}
