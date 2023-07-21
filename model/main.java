package model;

import controller.CreditCardAlgorithm;
import controller.PaypalAlgorithm;

public class main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("123", 25);
        Product shirts = new Product("567", 20);

        cart.addProduct(shirts);
        cart.addProduct(pants);
    
     //payment decisions
     cart.pay(new CreditCardAlgorithm("Paulo", "1247442845"));
     cart.pay(new PaypalAlgorithm("paulo@gmail.com", "vsvfgusg"));
    }

}
