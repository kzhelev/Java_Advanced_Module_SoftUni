package Generics.JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;


public class Jar <T> {
    private Deque<T> jar;

    public Jar() {
        jar = new ArrayDeque<>();
    }

    public void add (T element) {
        jar.push(element);
    }

    public T remove () {
        return jar.pop();
    }
}
