package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    //System.out.println(dp.getPrice());
    //dp.addTakeaway();
    //dp.addExtraCheese();
    //dp.addTakeaway();
    dp.addExtraToppings();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    //p.addTakeaway();
    System.out.println(p.getBill());


    Pizza j = new Pizza(false);
    j.addExtraCheese();
    j.addExtraToppings();
    //p.addTakeaway();
    System.out.println(j.getBill());
  }
}