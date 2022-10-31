package worldOfZuul.implementation;

import java.util.Scanner;

public class Person {
    private String name;
    private double foodPoints = 100;
    private double climatePoints = 0;
    private final double MAXFOODPOINTS = 100; // her indstilles maks antallet af foodpoints - konstanter i java skrives i caps
    private final double MOVEENERGY = 30; // her indstilles energiforbrug per move - konstanter i java skrives i caps


    /* Setter og getter til navn på Person */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /* Setter til navn ud fra konsolinput - metoden kan skelne mellem omdøbning og først navngivning */
    public void setNameFromInput() {
        Scanner scan = new Scanner(System.in); // tager input fra konsolen

        /* denne blok udføres kun ved omdøbning */
        if (name != null) { // hvis name ikke er 'null', blev der allerede oprettet et navn og koden i blokken udføres
            System.out.println("Do you want to change your username? \nType 'yes' or 'no'");
            while (!scan.hasNext("yes") && !scan.hasNext("no") && !scan.hasNext("y") && !scan.hasNext("n")) { // koden i while-loop bliver udført, hver gang der ikke blev typet yes/y/no/n -> hasNext() returner bool og 'kigger' kun på linjen, hvorved linjen efterfølgende stadig kan udlæses. Blev en linje udlæst, kan den ikke udlæses igen.
                scan.nextLine(); // hopper i nœste linje idet linjen uden et yes/no udlæses
            }
            if (scan.nextLine().trim().equalsIgnoreCase("no") || scan.nextLine().trim().equalsIgnoreCase("n")) {  // linjen med yes/no udlæses, da koden i while-loopen ikke har udlæst den - trim() fjerner mellemrum fra string linjen
                System.out.println("Returning to game...");
                return;
            }
        }


        /* denne blok udføres altid (medmindre man svarede 'no' før */
        System.out.println("Please enter a new username: ");
        setName(scan.nextLine().trim()); // sender input til setName() metoden

        if (name.trim().isEmpty()) {  // string -> trim() fjerner mellemrum af string -> is empty kigger om string er tom
            System.out.print("This is not a username.");
            name = null;    // for at være sikker på, at der ikke spørges (igen) efter om man vil omdøbe sig
            setNameFromInput();
        } else {
            System.out.println("Your username is now '" + name + "'");
        }

        scan.close();
    }



    /* Tilføje eller fjerne foodpoints -> max food points defineres i starten */
    public void addFoodPoints(double points) {
        if (foodPoints <= MAXFOODPOINTS) {
            foodPoints = foodPoints + points;
        } else {
            System.out.println("You are already full!");
        }

        if (foodPoints >= MAXFOODPOINTS) {
            foodPoints = 100;
            System.out.println("You have eaten yourself full!");
        }
    }

    public void removeFoodPoints(double points) {
        if (foodPoints - points > 0) {
            foodPoints -= points;
        } else if (foodPoints - points <= 0) {
            GameOver.endGame(climatePoints);
        }
    }


    /* Tilføje eller fjerne climatepoints */
    public void addClimatePoints(double points) {
        climatePoints += points;
    }

    public void removeClimatePoints(double points) {
        climatePoints -= points;
    }


    /* Skal udføres hver gang spilleren bevæger sig (fra rum til rum) */
    public void move() {
        removeFoodPoints(MOVEENERGY);
    }

}
