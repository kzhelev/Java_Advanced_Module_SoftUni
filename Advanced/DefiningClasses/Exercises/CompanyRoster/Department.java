package DefiningClasses.Exercises.CompanyRoster;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;
    private Set<Employee> departmentEmployees;
    private double wageCosts;
    private double averageSalary;

    public Department(String name) {
        this.name = name;
        departmentEmployees = new HashSet<>();
    }

    public void setWageCosts(double salary) {
        wageCosts = wageCosts + salary;
    }

    public double getWageCosts() {
        return wageCosts;
    }

    public void setDepartmentEmployees(Employee employee) {
        this.departmentEmployees.add(employee);
    }

    public Set<Employee> getDepartmentEmployees() {
        return departmentEmployees;
    }

    public void calculateAverageSalary() {
        averageSalary = wageCosts / departmentEmployees.size();
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public String getName() {
        return name;
    }

    public void printDepartmentEmployees() {
        this.departmentEmployees.stream().sorted((e1, e2) ->
                {
                    if (e1.getSalary() < e2.getSalary()) {
                        return 1;
                    } else if (e1.getSalary() > e2.getSalary()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
        ).forEach(e -> System.out.println(e.toString()));
    }
}
