package Polymorphism.MathOperation;

import java.util.Arrays;
import java.util.Collections;

public class MathOperation {

    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return add(add(a,b), c);
    }

    public int add(int a, int b, int c, int d) {
        return add(add(a,b,c), d);
    }

//    public int add(int... number) {
//        int[] allNumbers = number;
//        return Arrays.stream(allNumbers).sum();
//    }
}
