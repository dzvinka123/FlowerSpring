package ucu.edu.ua.lab7.flowerspring.src.filter;

import ucu.edu.ua.lab7.flowerspring.src.flower.Item;


public interface SearchFilter {
    boolean match(Item item);
}
