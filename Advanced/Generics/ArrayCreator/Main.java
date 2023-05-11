package Generics.ArrayCreator;


public class Main {
    public static void main(String[] args) {

        Integer[] newOne = ArrayCreator.create(5,5);
        String[] secondOne = ArrayCreator.create(String.class,5, "Pesho");
        System.out.println();

    }
}
