package ucu.edu.ua.lab7.flowerspring.src.Payment;

public interface Payment {
    void setPrice(double price);
    boolean getIsPayed();
    void pay(double price);
}