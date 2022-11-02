package worldOfZuul.implementation;
import java.util.ArrayList;

public interface Inventory {

    ArrayList<Item> INVENTORY = new ArrayList<Item>();

    public void addItem(Item item);

    public void removeItem(Item item);

    public ArrayList<Item> getItems();



}
