package Inheritance.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

    public T getRandomElement() {
        int end = size();
        Random random = new Random();

        return remove(random.nextInt(size()));
    }
}
