package Abstraction.SubmitAsolution;

import java.util.HashMap;
import java.util.Map;


public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {
        return this.students;
    }

    public void create(String[] args) {

            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);

            if (!students.containsKey(name)) {
                Student student = new Student(name, age, grade);
                students.put(name, student);
            }

    }

    public void show(String[] args) {

        String name = args[1];

        if (students.containsKey(name)) {
            students.get(name).printInfo();
        }

    }
}
