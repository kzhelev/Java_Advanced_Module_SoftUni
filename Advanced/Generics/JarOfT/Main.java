package Generics.JarOfT;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> newJar = new Jar<>();
        newJar.add(13);
        newJar.add(42);
        newJar.add(69);
        newJar.remove();

        System.out.println(newJar.remove());
    }
}
