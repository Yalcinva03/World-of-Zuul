package worldOfZuul.implementation;
import worldOfZuul.implementations.Food;
import worldOfZuul.implementations.Item;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class FoodContainer {

    private String name;
    private String description;

    HashMap<String, String> food = new HashMap<String, String>;
    private double respawnSpeed = 10;

    food.put("Tree", "Apple");
    food.put("Lake", "Fish");
    food.put("Field", "Cow");


    FoodContainer tree = new FoodContainer(new Food("Apple", 0.5, 20), 10);
    FoodContainer lake= new FoodContainer(new Food("Fish", 0.5, 20), 10);
    FoodContainer field = new FoodContainer(new Food("Cow", 0.5, 20), 10);



    public FoodContainer(Item item, int count) {



    }

    public String getName() {
        return name;
    }

    public String description() {
        return description;
    }

    public void addFood(Food food) {
        food.add(food);
    }

    public void removeFood(Item food){
        food.remove(food);
    }

    public void setFood(Item food){
        this.food = food;
    }

    public String getFood(String food) {
        return food;
    }

    public void setRespawnSpeed(double respawnSpeed){
        this.respawnSpeed = respawnSpeed;
    }
}

   /* public int randomFoodGen() {
        return (int) (Math.random() * 10);
    }/*

}
