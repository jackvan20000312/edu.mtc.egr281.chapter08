package edu.mtc.egr281.chapter08;

public class Rectangle extends Shape2D implements Measurable {

	public static final String DEFAULT_NAME = "Rectangle";
	private double length;
	private double width; 

	public Rectangle() {
		this(Rectangle.DEFAULT_NAME, Measurable.DEFAULT_VALUE, Measurable.DEFAULT_VALUE);
	}// Ending bracket of constructor

	public Rectangle(double newLength, double newWidth) {
		this (Rectangle. DEFAULT_NAME, newLength, newWidth);
	}// Ending bracket of constructor

public Rectangle(String newName, double newLength, double newidth) {
super (newName);
this.setLength(newLength);
this. setWidth(newidth);

}// Ending bracket of constructor|

public void setLength(double newLength) {
this. length = newLength;

}// Ending bracket of method setLength

public double getLength() {
return this. length;

}// Ending bracket of method getLength

public void setWidth(double newwidth) {
this.width = newwidth;

}// Ending bracket of method setWidth
public double getWidth() {
return this.width;
}// Ending bracket of method getWidth
@Override
public String toString() {
return super.toString() +", length:" + this.getLength() + ", width:" + this. getWidth();
}// Ending bracket of method toString

@Override
public double getArea() {
return 0.0;
}// Ending bracket of method getArea

@Override
public double getPerimeter() {
return 0.0;
}// Ending bracket of method getPerimeter
}// Ending bracket of class Rectangle