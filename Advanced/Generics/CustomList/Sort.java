package Generics.CustomList;

public class Sort<T extends Comparable<T>> {

    public static <T extends  Comparable<T>> void sort(CustomList<T> list) {

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
