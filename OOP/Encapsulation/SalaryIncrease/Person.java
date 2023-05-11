package Encapsulation.SalaryIncrease;

import java.text.DecimalFormat;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    private void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.age = age;
    }

    public void increaseSalary(double bonus) {
        if (age >= 30) {
            salary += salary * bonus / 100;
        } else {
            salary += (salary * bonus / 100) / 2;
        }

    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.0##");
        return String.format("%s %s gets %s leva", firstName, lastName, decimalFormat.format(salary));
    }

}
