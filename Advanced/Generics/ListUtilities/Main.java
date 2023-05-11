package Generics.ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(7);
        list.add(23);
        list.add(55);
        System.out.println(ListUtils.getMin(list));
        System.out.println(ListUtils.getMax(list));
    }
}
