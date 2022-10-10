package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();
        // your code goes here
//        int total = 0;
//        if(isVeg){
//             total=300;
//            total+=70;
//            total+=80;
//        }else{
//            total+=400;
//            total+=120;
//            total+=70;
//
//        }
//     Pizza.setPrice(total);
    }
}
