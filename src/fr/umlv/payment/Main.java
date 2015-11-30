package fr.umlv.payment;

/**
 * Created by steeve on 30/11/15.
 */
public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Employee bob = new Employee("bob", 90);
        Employee marta = new Employee("marta", 80);
        Employee carol = new Employee("carol", 120);
        payment.addEmployee(bob);
        payment.addEmployee(marta);
        payment.addEmployee(carol);
        bob.setSalary(100);
        marta.setBonus(new Bonus(30));
        System.out.println(payment.getAllEmployees());
        //System.out.println(payment.totalPayment());
    }
}
