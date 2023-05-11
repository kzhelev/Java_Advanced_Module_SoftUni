package Generics.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList <T extends Comparable<T>> {
    private List<T> customList;

    public CustomList () {
        customList = new ArrayList<>();
    }

    public void add(T element) {
        customList.add(element);
    }

    public void remove(int index) {
        customList.remove(index);
    }

    public boolean contains(T element) {
        return customList.contains(element);
    }

    public void swap(int index1, int index2) {
        T workElement = customList.get(index1);
        customList.set(index1, customList.get(index2));
        customList.set(index2, workElement);
    }

    public int countGreaterThan(T element) {
        int counter = 0;
        for (int i = customList.size() - 1; i >= 0; i--) {
            if (customList.get(i).compareTo(element) >= 1) {
                counter++;
            }
        }
        return counter;
    }

    public T getMin() {
        return Collections.min(customList);
    }

    public T getMax() {
        return Collections.max(customList);
    }

    public int size() {
        return customList.size();
    }

    public T get(int index) {
        return customList.get(index);
    }

    public void sort() {
        Collections.sort(customList);
    }

    public void set(int index, T element) {
        customList.set(index,element);
    }
}
