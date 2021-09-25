package structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Department implements Employee {
    List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public String details() {
        return this.employees.stream()
                             .map(Employee::details)
                             .collect(Collectors.joining(","));
    }
}
