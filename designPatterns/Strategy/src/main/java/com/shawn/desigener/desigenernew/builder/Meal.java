package com.shawn.desigener.desigenernew.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items= new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "items=" + items +
                '}';
    }
}
