package edu.mtc.egr281.chapter08;
public enum Choices {
ROCK("Rock","crushes", "cruches"), PAPER("Paper", "covers", "disproves"),
SCISSORS ("Scissors", "cuts", "decapitates"), SPOCK("Spock", "smashes", "vaporizes"),
LIZARD("Lizard", "poisons", "eats");
private String name;
private String verb1;
private String verb2;
private Choices(String newName, String newVerb1, String newVerb2) {
this.name = newName;
this.verb1 = newVerb1;
this.verb2 = newVerb2;
}// Ending bracket of constructor
public String getName() {
return this.name;
}// Ending bracket of method getName
public String getVerb1() {
return this. verb1;
}// Ending bracket of method getVerbl
public String getVerb2() {
return this. verb2;
}// Ending bracket of method getVerb2
private void setName(String newName) {
	this.name=newName;
}
}// Ending bracket of enum Choices