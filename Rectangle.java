package com.ex.demo;

public class Rectangle {
	double height=1;
	double width=1;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double height,double width) {
		this.height=height;
		this.width=width;
	}
	
	  public double getArea() {
		  return height*width;
	  }
	  
	  public double getPerimeter() {
		  return 2*(height+width);
	  }
}



