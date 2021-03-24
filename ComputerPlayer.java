package edu.mtc.egr281.chapter08;
import java.util.Random;
public class ComputerPlayer extends Player {
private Random randomizer;

public ComputerPlayer (String newName) {
super (newName) ;
this.randomizer = new Random();
}

public void makeChoice() {
this.setChoice(Choices.values() [this.randomizer .nextInt (Choices. values().length)]);
}
}