package edu.mtc.egr281.chapter08;
import java.util.Scanner;
public class HumanPlayer extends Player {
private Scanner keyboard;
public HumanPlayer(String newName, Scanner kb) {
super (newName);
this.keyboard = kb;
}// Ending bracket of constructor
public void makeChoice() {
for(int i = 0; i < Choices.values().length; ++i) {
System.out.println(i + ": " + Choices.values()[i].getName());
}// Ending bracket of for loop
System.out.println("Enter the number of your choice [0-5]: ");
this.setChoice(Choices.values() [keyboard.nextInt()]);
}// Ending bracket of method makeChoice
}// Ending bracket of class HumanPlayer