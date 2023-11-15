package ucu.edu.ua.lab7.flowerspring.src.filter;

import java.util.List;

import ucu.edu.ua.lab7.flowerspring.src.flower.FlowerBucket;
import ucu.edu.ua.lab7.flowerspring.src.flower.Flower;

import ucu.edu.ua.lab7.flowerspring.src.flower.FlowerColor;
import ucu.edu.ua.lab7.flowerspring.src.flower.FlowerPack;
import ucu.edu.ua.lab7.flowerspring.src.flower.FlowerType;
import ucu.edu.ua.lab7.flowerspring.src.flower.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Filter implements SearchFilter {
    private List<Flower> flowers = new ArrayList<>();
    private double maxPrice;
    private double minPrice;
    private List<FlowerColor> flowerColors = new ArrayList<>();
    private List<FlowerType> flowerTypes = new ArrayList<>();

    @Override
    public boolean match(Item item) {
        if (!(item instanceof FlowerBucket)) {
            return false;
        }

        FlowerBucket flowerBucket = (FlowerBucket) item;
        List<FlowerPack> flowerPacks = flowerBucket.getFlowerPacks();

        if (flowerBucket.getPrice() < minPrice || flowerBucket.getPrice() > maxPrice) {
            return false;
        }

        for (FlowerPack flowerPack : flowerPacks) {
            Flower flower = flowerPack.getFlower();
            if (!flowers.contains(flower)) {
                return false;
            }

            if (!flowerColors.contains(flower.getColor()) && !flowerTypes.contains(flower.getFlowerType())) {
                return false;
            }
        }

        return true;
    }

}
