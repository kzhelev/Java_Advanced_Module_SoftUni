package Inheritance.SingleInheritance;

public class Puppy extends Dog{

    public void weep() {
        System.out.println("weeping…");
    }

    @Override
    public void eat() {
        System.out.println("eating milk");
    }
}
