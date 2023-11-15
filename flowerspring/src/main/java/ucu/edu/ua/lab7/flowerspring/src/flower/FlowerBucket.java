package ucu.edu.ua.lab7.flowerspring.src.flower;

import java.util.ArrayList;
import java.util.List;


import lombok.Getter;

@ Getter
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double totalprice = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            totalprice += flowerPack.packPrice();
        }
        return totalprice;
    }

}
