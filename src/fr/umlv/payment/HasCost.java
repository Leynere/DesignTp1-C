package fr.umlv.payment;

import java.util.Objects;

abstract public class HasCost {
    private final String name;
    private long salary;
    private Bonus bonus;  // may be null

    protected HasCost(String name, long salary) {
        this.name = Objects.requireNonNull(name);
        this.salary = isValideSalary(salary);
    }

    protected long getSalary(){
        return salary;
    }

    protected long getBonus(){
        if(bonus == null){
            return 0;
        }
        return bonus.amount;
    }

    private long isValideSalary(long salary){
        if (salary < 0) {
            throw new IllegalArgumentException("amount < 0");
        }
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setSalary(long salary) {
        this.salary = isValideSalary(salary);
    }
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    abstract public long getCost();
}
