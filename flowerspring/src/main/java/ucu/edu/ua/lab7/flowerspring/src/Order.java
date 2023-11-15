package ucu.edu.ua.lab7.flowerspring.src;

import lombok.Setter;

import java.util.LinkedList;

import ucu.edu.ua.lab7.flowerspring.src.Payment.Payment;
import ucu.edu.ua.lab7.flowerspring.src.delivery.Delivery;
import ucu.edu.ua.lab7.flowerspring.src.flower.FlowerBucket;


public class Order {
    private LinkedList<ucu.edu.ua.lab7.flowerspring.src.flower.FlowerBucket> items;
    @Setter
    private Payment paymentStrategy;
    @Setter
    private Delivery deliveryStrategy;

    public double calculateTotalPrice() {
        double ans = 0;
        for (FlowerBucket item : items) {
            ans += item.getPrice();
        }
        return ans;
    }

    public boolean processOrder() {
        if (paymentStrategy.getIsPayed()) {
            System.out.println("Starting delivery ...");
            deliveryStrategy.deliver(items);
            System.out.println("Order was successfully processed!");
            return true;
        } else {
            System.out.println("You have to pay for order before "
                    + "we can deliver it to you");
            return false;
        }
    }

    public void addItem(FlowerBucket item) {
        items.add(item);
        paymentStrategy.setPrice(calculateTotalPrice());
    }

    public void removeItem(FlowerBucket item) {
        items.remove(item);
        paymentStrategy.setPrice(calculateTotalPrice());
    }
}