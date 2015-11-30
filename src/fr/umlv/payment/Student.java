package fr.umlv.payment;


public class Student extends HasCost{

    protected Student(String name, long salary) {
        super(name, salary);
    }

    @Override
    public long getCost() {
        return  (super.getSalary()/2) + super.getBonus();
    }
}