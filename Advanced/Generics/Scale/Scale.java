package Generics.Scale;

public class Scale<T extends Comparable<T>> {

    public T getHeavier (T item1, T item2) {
        int result = item1.compareTo(item2);

        if (item1.equals(item2)) {
            return null;
        }

        return result == -1 ? item2 : result == 1 ? item1 : item1;
    }
}
