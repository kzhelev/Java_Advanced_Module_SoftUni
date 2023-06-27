package exampreparationthree.softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {

    private int capacity;
    private List<Student> data;

    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCount() {
        return data.size();
    }

    public String insert(Student student) {
        if (getStudent(student.getFirstName(),student.getLastName()) != null) {
            return String.format("Student is already in the hall.");
        } else if (data.size() < capacity) {
            data.add(student);
            return String.format("Added student %s %s.",student.getFirstName(),student.getLastName());
        } else {
            return "The hall is full.";
        }
    }

    public String remove(Student student) {
        if (getStudent(student.getFirstName(),student.getLastName()) == null) {
            return "Student not found.";
        } else {
            data.remove(student);
            return String.format("Removed student %s %s.",student.getFirstName(),student.getLastName());
        }
    }

    public Student getStudent(String firstName, String lastName) {
        return data.stream()
                .filter(e -> e.getFirstName().equals(firstName))
                .filter(e -> e.getLastName().equals(lastName))
                .findFirst()
                .orElse(null);
    }

    public String getStatistics() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Hall size: %d\n",getCount()));
        data.stream().forEach(e -> stringBuilder.append(e+"\n"));

        return stringBuilder.toString().trim();
    }
}
