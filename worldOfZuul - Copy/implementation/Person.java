package worldOfZuul.implementation;

import java.util.Scanner;

public class Person {

    private String name;
    private double foodPoints = 100;
    private double climatePoints = 100;

    public Person (String name) {
        this.name = name;
    }

    public Person () {

    }

    public void setname(String name){
        this.name = name;
    }

    public void initName(){
        boolean dontcont = false;
        while(dontcont == false) {
            if (dontcont == false) {
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter username:");
                name = myObj.nextLine();  // Read user input
                if (name == "") {
                    System.out.println("Please enter a username!");
                    System.out.println("");
                } else {

                    System.out.println("Username is: " + name);  // Output user input
                    Person user = new Person(name);
                    dontcont = true;
                }
            }
        }
    }
    public void setNameChallenge(){
        boolean changeNameChallenge = false;
        String newUserNameTest;
        System.out.println("Do you want to change your username?");
        System.out.println("Type yes or no");
        while(changeNameChallenge == false) {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            newUserNameTest = myObj.nextLine();  // Read user input

            if (newUserNameTest.equals("yes")) {
                Scanner myObjTwo = new Scanner(System.in);
                System.out.println("Please enter a new username!");

                name = myObjTwo.nextLine();
                System.out.println("Your username is now '" + name + "'");
                System.out.println("Returning to game...");
                break;
            }

            if (newUserNameTest.equals("no")) {
                System.out.println("Returning to game...");

                break;
            } else {
                System.out.println("Please type yes or no");
            }
        }
    }

    public String getName() {
        return name;
    }

    public double getFoodPoints() {
        return foodPoints;
    }

    public void addFoodPoints(double foodPoints) {
        this.foodPoints += foodPoints;
    }

    public void removeFoodPoints(double foodPoints) {
        this.foodPoints -= foodPoints;
    }

    public double getClimatePoints() {
        return climatePoints;
    }

    public void addClimatePoints(double climatePoints) {
        this.climatePoints += climatePoints;
    }

    public void removeClimatePoints(double climatePoints) {
        this.climatePoints -= climatePoints;
    }



    public void move() {

    }
}
