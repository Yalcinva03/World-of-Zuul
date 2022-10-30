package worldOfZuul.implementation;

public class Food extends Item {

    private double foodPoints;
    private double climatePoints;
    private int expireDays;
    private String name;
    private String description;

    public Food(double foodPoints, double climatePoints, String name, String description) {
        super(name, description);
        this.description = description;
        this.name = name;
        this.foodPoints = foodPoints;
        this.climatePoints = climatePoints;
    }

    @Override
    public String toString() {
        return "Food: " +name+
                ", Foodpoints=" + foodPoints +
                ", Climatepoints=" + climatePoints +
                ", Days until expiry=" + expireDays+
                "\n"
                ;
    }

    public void setFoodPoints(double foodPoints){
        this.foodPoints = foodPoints;
    }

    public double getFoodPoints() {
        return foodPoints;
    }

    public void setClimatePoints(double climatePoints) {
        this.climatePoints = climatePoints;
    }

    public void removeExpireDays() {
        /**/
    }

    public int getExpireDays() {
        return expireDays;
    }

    }


