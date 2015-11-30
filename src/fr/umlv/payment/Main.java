package fr.umlv.payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Employee bob = new Employee("bob", 90);
        Employee marta = new Employee("marta", 80);
        Employee carol = new Employee("carol", 120);
        payment.addHasCost(bob);
        payment.addHasCost(marta);
        payment.addHasCost(carol);
        bob.setSalary(100);
        marta.setBonus(new Bonus(30));
        System.out.println(payment.getAllEmployees());
        System.out.println(payment.getPayment());
    }
}
