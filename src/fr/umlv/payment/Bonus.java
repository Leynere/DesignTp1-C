package fr.umlv.payment;

public class Bonus {
  final long amount;

  public Bonus(long amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("amount < 0");
    }
    this.amount = amount;
  }
}