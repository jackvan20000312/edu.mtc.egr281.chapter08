package edu.mtc.egr281.chapter08;
public class Shape2D {
private String name;

public Shape2D() {
this(Shape2D.class.getName());
}// Ending bracket of default constructor

public Shape2D(String newName) {
this.setName(newName) ;
}// Ending bracket of constructor

public String getName() {
return this.name;
}// Ending bracket of method getName

public void setName(String newName) {
this.name = newName;
}// Ending bracket of method setName

}// Ending bracket of class Shape2D