package Generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(51);
        list.add(1);
        list.add(64);
        list.add(33);
        list.add(7);
        list.add(2);

        sort(list);

        System.out.println(list);
    }

    public static <T extends  Comparable<T>> void sort(List<T> list) {

        for (int i = list.size()-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    T workElement = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,workElement);
                }
            }
        }

    }
}
