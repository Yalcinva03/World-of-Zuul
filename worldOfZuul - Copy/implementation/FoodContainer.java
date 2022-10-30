package worldOfZuul.implementation;

import java.util.ArrayList;

public class FoodContainer {

    private String name;
    private String description;
    private boolean isToolRequired;
    private Tool requiredTool;
    private boolean hasFood;

    ArrayList<Food> foodArrayList = new ArrayList<Food>();
    Food aeble = new Food(10, 50, "Æble", "Et saftigt æble");
    Food agurk = new Food(10, 50, "Agurk", "Et saftigt æble");
    Food steak = new Food(10, 50, "Steak", "Et saftigt æble");
    Food gulerod = new Food(10, 50, "Gulerod", "Et saftigt æble");
    Food ris = new Food(10, 50, "Ris", "Et saftigt æble");
    Food pasta = new Food(10, 50, "Pasta", "Et saftigt æble");
    Food kyllingebryst = new Food(10, 50, "Kyllingebryst", "Et saftigt æble");
    Food havregryn = new Food(10, 50, "Havregryn", "Et saftigt æble");
    Food smoothie = new Food(10, 50, "Smoothie", "Et saftigt æble");
    Food banan = new Food(10, 50, "Banan", "Et saftigt æble");
    public FoodContainer() {

        foodArrayList.add(aeble);
        foodArrayList.add(agurk);
        foodArrayList.add(steak);
        foodArrayList.add(gulerod);
        foodArrayList.add(ris);
        foodArrayList.add(pasta);
        foodArrayList.add(kyllingebryst);
        foodArrayList.add(havregryn);
        foodArrayList.add(smoothie);
        foodArrayList.add(banan);


    }

    public String getName() {
        return name;
    }

    public String description() {
        return description;
    }

    public void addFood(Food food) {

    }

    public void setFood() {

    }

    public Food getFood() {
        return foodArrayList.get(randomFoodGen());
    }

    public int randomFoodGen() {
        return (int) (Math.random() * 10);
    }

}
