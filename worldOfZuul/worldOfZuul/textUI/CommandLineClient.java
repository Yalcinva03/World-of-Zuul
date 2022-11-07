/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldOfZuul.textUI;

import worldOfZuul.Command;
import worldOfZuul.Commands;
import worldOfZuul.Game;
import worldOfZuul.implementation.Inventory;
import worldOfZuul.implementation.Item;
import worldOfZuul.implementation.Person;

/**
 *
 * @author ancla
 */
public class CommandLineClient {
    Person person = new Person();

    private Parser parser;
    private Game game;
    public CommandLineClient() {
        game = new Game();
        parser = new Parser(game);
    }

    public void play() {
        printWelcome();

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type '" + Commands.HELP + "' if you need help.");
        System.out.println();
        System.out.println(game.getRoomDescription());
    }

    private void printHelp() {
        for(String str : game.getCommandDescriptions())
        {
            System.out.println(str + " ");
        }
    }

    //Controller
    public boolean processCommand(Command command) {
        boolean wantToQuit = false;

        Commands commandWord = command.getCommandName();

        if (commandWord == Commands.UNKNOWN) {
            System.out.println("I don't know what you mean...");
            return false;
        }
        if (commandWord == Commands.INVENTORY) {
            System.out.println("These are the items you have in your inventory");
            for (Item i : Inventory.INVENTORY) {
                System.out.println(i);
            }

        }

        if (commandWord == Commands.HELP) {
            System.out.println("You are lost. You are alone. You wander");
            System.out.println("around at the university.");
            System.out.println();
            System.out.println("Your command words are:");
            printHelp();
        } else if (commandWord == Commands.GO) {
            if (game.goRoom(command)) {
                System.out.println(game.getRoomDescription());
            } else {
                System.out.println("Can't walk in that direction.");
            }
        } else if (commandWord == Commands.QUIT) {
            if (game.quit(command)) {
                wantToQuit = true;
            } else {
                System.out.println("Quit what?");
            }

        } else if (commandWord == Commands.EAT){
            if(command.hasCommandValue()){
                for (Item i : person.getItems()) {
                    if(commandWord.toString().equalsIgnoreCase(i.getName())) {
                        person.getItems().remove(i);
                        break;
                    }
                    else{
                        System.out.println("You don't have that, so you can't eat it...");
                        break;
                    }
                }
            }
            else{
                System.out.println("You forgot to say what you wanted to eat :/");
                System.out.println("Try again!");
            }
        }

        return wantToQuit;
    }
}
