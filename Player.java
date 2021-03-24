package edu.mtc.egr281.chapter08;

public abstract class Player {

	private String name;
	private Choices choice;
	private int numberOfWins;

	public Player(String newName) {
		this.setName(newName) ;
		this.setNumberOfWins(0);
	}// Ending bracket of constructor

	public String getName() {
		return this.name;
	}// Ending bracket of method getName

	public Choices getChoice() {
		return this. choice;
	}// Ending bracket of method getChoice

	public int getNumberOfWins() {
		return this.numberOfWins;
	}// Ending bracket of method getNumberOfwWins

	private void setName(String newName) {
		this.name = newName;
	}// Ending bracket of method setName

	protected void setChoice(Choices newChoice) {
		this.choice = newChoice;
	}// Ending bracket of method setChoice

	private void setNumberOfWins(int newNumberOfWins) {
		this.numberOfWins = newNumberOfWins;
	}// Ending bracket of method setNumberOfWins

	public void incrementNumberOfwins() {
		this. setNumberOfWins(this.getNumberOfWins() + 1);
	}// Ending bracket of method incrementNumberOfwins

	public abstract void makeChoice();
}// Ending bracket of class Player