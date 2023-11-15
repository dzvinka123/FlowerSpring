package ucu.edu.ua.lab7.flowerspring.src.store;

import java.util.ArrayList;
import java.util.List;

import ucu.edu.ua.lab7.flowerspring.src.filter.SearchFilter;

import ucu.edu.ua.lab7.flowerspring.src.flower.Item;

public class Store {
    private List<Item> items;

    public List<Item> search(SearchFilter filter) {
        List<Item> foundsitem = new ArrayList<>();
        for (Item item: items) {
            if (filter.match(item)) {
                foundsitem.add(item);
            }
        }
        return foundsitem;
    }

}


 
