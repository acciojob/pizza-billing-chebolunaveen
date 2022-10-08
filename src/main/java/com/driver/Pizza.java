package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    int flag_cheese=0;
    int flag_topping=0;
    int flag_bag=0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price+=300;
            bill="Base Price Of The Pizza:"+price+"\n";
        }else{
            price+=400;
            bill="Base Price Of The Pizza:"+price+"\n";
        }
    }



    public static void setPrice(int price) {
        price+= price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes ice
        if(flag_cheese==0){
            price+=80;
            flag_cheese=1;
        }
        bill+="Extra Cheese Added:"+80+"\n";
    }

    public void addExtraToppings(){
        // your code goes
        if(flag_topping==0) {
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
            flag_cheese=1;
        }
        bill+="Extra Toppings Added:"+70+"\n";
    }


    public void addTakeaway(){
        // your code goes here
        if(flag_bag==0){
            price+=20;
            flag_bag=1;
        }
     bill+="Paperbag Added:"+20+"\n";
    }

    public String getBill(){
        // your code goes here
     bill+="Total Price: "+price+"\n";


        return this.bill;
    }
}
