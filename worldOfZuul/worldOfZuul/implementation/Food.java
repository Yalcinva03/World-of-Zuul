package worldOfZuul.implementation;
public class Food extends Item {

    private double foodPoints;
    private double climatePoints;
    private int expireDays;
    private double coValue;

    public Food(double foodPoints, double climatePoints) {
        this.climatePoints = climatePoints;
        this.foodPoints = foodPoints;
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

    public double getClimatePoints() {

        return climatePoints;

    }
    public int getExpireDays() {
        return expireDays;
    }
}


