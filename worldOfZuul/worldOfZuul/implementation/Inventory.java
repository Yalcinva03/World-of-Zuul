package worldOfZuul.implementation;
import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> inventory = new ArrayList<Item>();

    public void addItem(Item item) {
       inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public ArrayList<Item> getItems() {
        return inventory;
    }



}
