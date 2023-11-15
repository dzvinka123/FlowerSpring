package ucu.edu.ua.lab7.flowerspring.src.Payment;

import lombok.Setter;
import lombok.Getter;

@Getter
public class PayPalPaymentStrategy implements Payment {
    private double payed = 0;
    @Setter
    private double price;

    public PayPalPaymentStrategy(double price) {
        this.price = price;
    }

    @Override
    public boolean getIsPayed() {
        return payed >= price;
    }

    @Override
    public void pay(double payedPrice) {
        System.out.println("Thank you for your PayPal payment!");
        payed += payedPrice;
    }

}