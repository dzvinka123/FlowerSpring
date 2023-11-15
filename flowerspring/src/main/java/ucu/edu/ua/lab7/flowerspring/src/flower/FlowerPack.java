package ucu.edu.ua.lab7.flowerspring.src.flower;
import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;


    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }
    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity < 1 ? 0 : quantity;
    }

    public double packPrice() {
        return flower.getPrice() * quantity;
    }
}

