package IteratorsAndComparators.ListyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {

    public class LIterator implements Iterator<String> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public String next() {
            return list.get(index+1);
        }
    }

    private int index;
    private List<String> list;

    public ListyIterator(String...strings) {
        index = 0;
        setList(strings);
    }

    public int getIndex() {
        return index;
    }

    public void setList(String... strings) {
        this.list = Arrays.asList(strings);
    }

    public List<String> getList() {
        return list;
    }

    public boolean move() {
        if (index +1 < list.size()) {
            this.index++;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasNext() {
        if (index +1 < list.size()) {
            return true;
        } else {
            return false;
        }
    }

    public String print() {
        if (list.size() != 0  &&  !list.get(0).equals("") && index < list.size()) {
            return list.get(index);
        } else {
            return "Invalid Operation!";
        }
    }

    public void printAll() {
        list.forEach(e -> System.out.print(e.toString()+" "));
    }

    @Override
    public Iterator<String> iterator() {
        return new LIterator();
    }
}
