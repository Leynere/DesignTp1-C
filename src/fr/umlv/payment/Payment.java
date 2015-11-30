package fr.umlv.payment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Payment {
  private final ArrayList<Employee> employees = new ArrayList<>();
  
  public void addEmployee(Employee employee) {
    Objects.requireNonNull(employee);
    employees.add(employee);
  }

  public List<Employee> getAllEmployees() {
    return Collections.unmodifiableList(employees);
  }
}