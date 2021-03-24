package edu.mtc.egr281. chapter08;
import java.util.Scanner;
public class RPSLSgame {
private static Scanner kb;
private static Player[] player;
public static void main(String[] args) {
kb = new Scanner(System.in);
createPlayers (gameMode());
do {
for(int i = 0; i < player.length; ++i) {
player[i].makeChoice();
System. out. print (player[i].getName() + " selected ");
System. out. println(player[i] .getChoice().getName());
}// Ending bracket of for loop
determineWinner();
printScore();
} while(isGameStillGoing());
kb. close();
}// Ending bracket of method main
public static int gameMode() {
		System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock");
		System.out.println("Possible game modes:");
		System.out.println("0: Human vs. Human");
		System.out.println("1: Human vs. Computer");
		System.out.println("2: Computer vs. Computer");
		System.out.print("Please select a mode [0-2]: ");
		return kb.nextInt();
}// Ending bracket of method gameMode
public static void createPlayers(int mode) {
player = new Player[2];
if(mode == 0) {
System.out.print("Please enter name of first human player: ");
player[0] = new HumanPlayer(kb.next(), kb);
System.out.print("Please enter name of second human player: ");
player[1] = new HumanPlayer(kb.next(), kb);
} else if(mode == 1) {
System.out.print("Please enter name of human player: ");
player[0] = new HumanPlayer(kb.next(), kb);
player[1] = new ComputerPlayer ("BBS");
} else {
player[0] = new ComputerPlayer("C3P0");
player[1] = new ComputerPlayer("R2D2");
}// Ending bracket of if
}// Ending bracket of method createPlayers
public static boolean isGameStillGoing() {
boolean rv = true;
for(int i = 0; i < player.length; ++i) {
if (player [i].getNumberOfWins() == 5) {
rv = false;
break;
}// Ending bracket of if
}// Ending bracket of for loop
return rv;
}// Ending bracket of method isGameStillGoing
public static void determineWinner() {
int difference = player[0].getChoice().ordinal() - player[1].getChoice().ordinal();
if(difference < 0) {
difference = difference + Choices.values().length;
}// Ending bracket of if
if(difference == 1 || difference == 3) {
System.out.print(player[0].getName() + " wins, ");
player[0].incrementNumberOfwins();
System.out. print(player [0] .getChoice().getName());
if(difference == 1) {
System.out.print(" " + player[0].getChoice().getVerb1() +" ");
} else {
System.out.print(" " + player [0].getChoice().getVerb2() +" ");
}// Ending bracket of if
System.out.println(player[1].getChoice().getName());
} else if(difference == 2 || difference == 4) {
System.out.print(player[1].getName() + " wins, ");
player[1].incrementNumberOfwins();
System.out.print(player[1].getChoice().getName());
if(difference == 2) {
System.out.print(" " + player[1].getChoice().getVerb2() +" ");
} else {
System.out.print(" " + player[1].getChoice().getVerb1() +" ");
}// Ending bracket of if
System.out. println (player [6]. getChoice().getName());
} else {
System.out.println("Tie!! No winner this time.");
}// Ending bracket of if
}// Ending bracket of method determineWinner
public static void printScore() {
System. out.println();
for(int i = 0; i < player.length; ++i) {
System.out.print(player[i].getName() + " has ");
System.out.println(player[i].getNumberOfWins() + " wins.");
}// Ending bracket of for loop
System.out.println();
}// Ending bracket of method printScore
}