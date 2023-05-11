package Abstraction.SubmitAsolution;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printInfo() {

        String typeOfStudent;

        if (getGrade() >= 5.00) {
            typeOfStudent = "Excellent student.";
        } else if (getGrade() < 5.00 && getGrade() >= 3.50) {
            typeOfStudent = "Average student.";
        } else {
            typeOfStudent = "Very nice person.";
        }

        String view = String.format("%s is %s years old. %s", getName(), getAge(), typeOfStudent);

        System.out.println(view);
    }
}
