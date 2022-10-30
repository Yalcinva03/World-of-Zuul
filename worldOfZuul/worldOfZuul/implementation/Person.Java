package worldOfZuul.implementation;

import java.util.Scanner;

public class Person{
  private String name;
  private double foodPoints = 100;
  private double climatePoints = 0;
  private double maxFoodPoints = 100; //dette kan ændres hvis vi ændrer mening senere
  private double moveEnergyUsed = 30; //dette kan også ændres hvis vi ændrer mening senere
  
  //Setter og getter til navn på Person
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  
  // her er funktionerne til at tilføje eller fjerne points fra en form for "bar" eller et attributerne af med max
  public void addFoodPoints(double points){
    if(foodPoints <= maxFoodPoints){
      foodPoints = foodPoints + points;
    }
    else{
      System.out.println("You are already full!")
    }
    
    if(foodpoints >= maxFoodPoints){
      foodPoints = 100;
      System.out.println("You have eaten yourself full!")
      }
  }
  public void removeFoodPoints(double points){
    if(foodPoints - points > 0){
      foodPoints = foodPoints - points;
    }
    else(foodPoints - points <=0){
      endGame();
    }
  }
  
  public void addClimatePoints(double points){
    climatePoints += points;
  }
  
  public void removeClimatePoints(double points){
    climatePoints -= points;
  }
  
  public void move(String /*Ved ikke hvad vi skal have her endnu*/){
    removeFoodPoints(moveEnergyUsed);
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
  
  public void endGame(){ /* denne funktion kan flyttes til en EndGameScreen klasse senere*/
    /* denne linje er til at kunne starte endGameScreen eller således*/
    if(climatePoints >=0){
      System.out.println("You did well! your eating habits didnt have a negative impact on the climate.");
      System.out.println("Your score was "+climatePoints+" Climate Points");
    }
    else{
      System.out.println("Better luck next time! your eating habits had a negative impact on the climate.");
      System.out.println("Your score was "+climatePoints+" Climate Points");
    }
  }
}
