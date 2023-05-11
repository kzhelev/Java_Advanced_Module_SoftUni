package Generics.GenericBox;

public class Box<T> {

    public String toString(T values) {
        return values.getClass().getName() + ": " + values;
    }
}
