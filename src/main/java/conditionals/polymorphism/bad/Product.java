package main.java.conditionals.polymorphism.bad;

public class Product {

    private static final Double COMMISSION = 0.10;
    private static final Double SHIPPING = 5.99;

    private String name;
    private String type;
    private Double price;

    double calculatePrice(){

        switch(this.type){
            case "SIMPLE":
                return this.price + SHIPPING;
            case "MEDIUM":
                return this.price + price * COMMISSION + SHIPPING;
            case "PREMIUM":
                return this.price + price * COMMISSION;
            default:
                return this.price;
        }
    }

}
