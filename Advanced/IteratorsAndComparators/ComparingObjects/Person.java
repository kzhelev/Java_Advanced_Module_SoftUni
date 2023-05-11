package IteratorsAndComparators.ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0 && this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format(name + " " + age);
    }
}
