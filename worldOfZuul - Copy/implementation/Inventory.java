package worldOfZuul.implementation;
import java.util.ArrayList;

public class Inventory {

    private Item[] items = new Item[50];
    private ArrayList<Item> itemsList = new ArrayList<Item>();

    public void addItem(Item item) {

        for(int i = 0; i<items.length; i++){
            if (items[i] == null){
                items[i] = item;
                break;
            }
        }
    }

    public void addItemList(Item item) {
        itemsList.add(item);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "itemsList=" + itemsList +
                '}';
    }

    public ArrayList<Item> getItems() {
        return itemsList;
    }

    public String getItems(String name) {

        for(int i = 0; i<itemsList.size(); i++) {
            if(itemsList.get(i).getName().equals(name)) {
                itemsList.remove(i);
                return "You have eaten one "+"'"+name+"'";
            }
        }
      /*  return itemsList.get(name);*/
        return "You do not have a food item called: "+name+"!"+"\n"+"Returning to game...";
    }



    public void removeItem() {

    }

    public boolean checkEmpty() {
        if(itemsList.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }


}
