package fr.umlv.payment;

public class Employee extends HasCost{

  protected Employee(String name, long salary) {
    super(name, salary);
  }

  @Override
  public long getCost() {
    return  super.getSalary() + super.getBonus();
  }
}