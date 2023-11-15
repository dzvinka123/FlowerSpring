package ucu.edu.ua.lab7.flowerspring.src.delivery;

import java.util.List;

import ucu.edu.ua.lab7.flowerspring.src.flower.FlowerBucket;

public interface Delivery {
    void deliver(List<FlowerBucket> items);
}
