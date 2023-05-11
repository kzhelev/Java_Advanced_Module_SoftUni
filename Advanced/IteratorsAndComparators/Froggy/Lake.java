package IteratorsAndComparators.Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    public class Frog implements Iterator<Integer> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Integer next() {
            Integer element = list.get(index);
            index += 2;
            if (index>= list.size() && index % 2 == 0) {
                index = 1;
            }
            return element;
        }

    }

    private List<Integer> list;

    public Lake(Integer... elements) {
        list = Arrays.asList(elements);
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
