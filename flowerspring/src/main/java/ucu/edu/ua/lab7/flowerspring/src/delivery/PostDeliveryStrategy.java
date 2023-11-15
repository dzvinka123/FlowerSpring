package ucu.edu.ua.lab7.flowerspring.src.delivery;

import java.util.List;

import ucu.edu.ua.lab7.flowerspring.src.flower.FlowerBucket;


public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<FlowerBucket> items) {
        System.out.println("The next items have been sent to you via post: ");
        for (FlowerBucket item : items) {
            // System.out.println(item.getDescription());
        }
    }
}