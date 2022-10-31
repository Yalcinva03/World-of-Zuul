package worldOfZuul.implementation;

import worldOfZuul.Room;

import java.util.ArrayList;

public class Map {

    private int xSize;
    private int ySize;

    private ArrayList<ArrayList<Room>> map = new ArrayList<>();

    public Map(int x, int y) { // x * y map size fx 9*9
        setXY(x,y);

        /* danner en indre ArrayList<Room> i hver række af den ydre ArrayList<>  */
        for (int i = 0; i < y; i++) {
            map.add(i, new ArrayList<Room>());
        }

        /* danner rum */
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                map.get(i).add(j, new Room(i+"."+j)); // laver nyt rum på plads 0.0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 1.0 1.1 1.2 ... 1.8 2.0 2.1 2.2 ... osv., hvor første nummer svarer til pladsen i første array og andet nummer svarer til pladsen i arrayet, som ligger på pladsen i det første nummer. På hver nyt første nummer, er der altså et andet array med størelsen givet ved y.
            }
        }

        /* tilføjer udgangene til nord */
        for (int i = 0; i < y-1; i++) { // y-1 stops 1 row erlier
            for (int j = 0; j < x; j++) {
                map.get(i).get(j).setExit("north", map.get(i+1).get(j)); // sets the north room to the room in row above this current room, and therefore stops 1 row before the last row
            }
        }

        /* tilføjer udgangene til syd */
        for (int i = 1; i < y; i++) { // i=1 starts at row 1
            for (int j = 0; j < x; j++) {
                map.get(i).get(j).setExit("south", map.get(i-1).get(j)); // sets the south room to the room in row under this current room, and therefore starts with row 1 and not 0
            }
        }

        /* tilføjer udgangene til øst */
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x-1; j++) { // x-1 stops 1 index erlier
                map.get(i).get(j).setExit("east", map.get(i).get(j+1)); // sets the east room to the room on the right from current room, and therefore stops 1 index before the last one
            }
        }

        /* tilføjer udgangene til vest */
        for (int i = 0; i < y; i++) {
            for (int j = 1; j < x; j++) { // j=1 starts at index 1 instead of 0
                map.get(i).get(j).setExit("west", map.get(i).get(j-1)); // sets the west room to the room on the left from current room, and therefore starts at index 1
            }
        }
    }

    private void setXY(int x, int y) {
        xSize = x;
        ySize = y;
    }

    public ArrayList<ArrayList<Room>> getMap(){
        return map;
    }

    public Room getMiddleRoom(){
        return getMap().get(ySize/2).get(xSize/2);
    }

}
