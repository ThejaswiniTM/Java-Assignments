package com.cogzy.model;

public class Square extends Rectangle {


	public Square() {

	}

	public Square(double side)
	{
		setWidth(side);
		setLength(side);
	}
	public Square(double side, String color, boolean filled)
	{
		super(side, side, color, filled);
	}
public double getside()
{
	return getWidth();
}
public void setside(double side)
{
	setWidth(side);
	setLength(side);
}

public double getArea()
{
	return super.getArea();
}
public double getPerimeter()
{
	return super.getPerimeter();
}

@Override
public String toString() {
	return "Square [getWidth()=" + getWidth() + "]";
}

}
