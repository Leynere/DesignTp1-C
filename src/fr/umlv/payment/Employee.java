package fr.umlv.payment;

import java.util.Objects;

public class Employee {
  private final String name;
  private long salary;
  private Bonus bonus;  // may be null
  
  public Employee(String name, long salary) {
    this.name = Objects.requireNonNull(name);
    if (salary < 0) {
      throw new IllegalArgumentException("amount < 0");
    }
    this.salary = salary;
  }
  
  @Override
  public String toString() {
    return name;
  }
  
  public void setSalary(long salary) {
    if (salary < 0) {
      throw new IllegalArgumentException("amount < 0");
    }
    this.salary = salary;
  }
  public void setBonus(Bonus bonus) {
    this.bonus = bonus;
  }
}