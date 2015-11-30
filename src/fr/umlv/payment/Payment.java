package fr.umlv.payment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Payment {
  private final ArrayList<HasCost> hasCosts = new ArrayList<>();
  
  public void addHasCost(HasCost hasCost) {
    Objects.requireNonNull(hasCost);
    hasCosts.add(hasCost);
  }

  public List<HasCost> getAllEmployees() {
    return Collections.unmodifiableList(hasCosts);
  }

  public long getPayment(){
    return hasCosts.stream().mapToLong((x)-> x.getCost()).sum();
  }
}