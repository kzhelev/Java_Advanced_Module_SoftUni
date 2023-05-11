package DefiningClasses.Exercises.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int employeesNumber = Integer.parseInt(scanner.nextLine());

        String[] employeeInfo;

        Map<String, Department> departmentsList = new HashMap<>();

        for (int i = 0; i < employeesNumber; i++) {

            employeeInfo = scanner.nextLine().split(" ");

            Employee employee = newEmployeeCreation(employeeInfo);

            processDepartmantInfoAndAddingToDepartmantsList(departmentsList, employee);

        }

        List<String> sortedDepartmentsList = departmentsList.entrySet().stream().sorted((e1, e2) -> {
            if (e1.getValue().getAverageSalary() < e2.getValue().getAverageSalary()) {
                return 1;
            } else if (e1.getValue().getAverageSalary() > e2.getValue().getAverageSalary()) {
                return -1;
            } else {
                return 0;
            }
        }).map(Map.Entry::getKey).toList();

        System.out.println("Highest Average Salary: "+sortedDepartmentsList.get(0));
        departmentsList.get(sortedDepartmentsList.get(0)).printDepartmentEmployees();

    }

    private static void processDepartmantInfoAndAddingToDepartmantsList(Map<String, Department> departmentsList, Employee employee) {
        if (!departmentsList.containsKey(employee.getDepartment())) {
            departmentsList.put(employee.getDepartment(), new Department(employee.getDepartment()));
            departmentsList.get(employee.getDepartment()).setDepartmentEmployees(employee);

        } else {
            departmentsList.get(employee.getDepartment()).setDepartmentEmployees(employee);
        }

        departmentsList.get(employee.getDepartment()).setWageCosts(employee.getSalary());
        departmentsList.get(employee.getDepartment()).calculateAverageSalary();
    }

    private static Employee newEmployeeCreation(String[] employeeInfo) {
        Employee employee;
        if (employeeInfo.length == 6) {
            employee = new Employee(employeeInfo[0], Double.parseDouble(employeeInfo[1]), employeeInfo[2],
                        employeeInfo[3], employeeInfo[4], Integer.parseInt(employeeInfo[5]));
        } else if (employeeInfo.length == 5) {
            if (employeeInfo[4].contains("@")) {
                employee =  new Employee(employeeInfo[0], Double.parseDouble(employeeInfo[1]), employeeInfo[2],
                        employeeInfo[3], employeeInfo[4]);
            } else {
                employee =  new Employee(employeeInfo[0], Double.parseDouble(employeeInfo[1]), employeeInfo[2],
                        employeeInfo[3], Integer.parseInt(employeeInfo[4]));
            }
        } else {
            employee = new Employee(employeeInfo[0], Double.parseDouble(employeeInfo[1]), employeeInfo[2],
                    employeeInfo[3]);
        }
        return employee;
    }

}
