package com.example.Principle_Open_Closed_principle;


abstract class Shape{
  abstract public void calculateArea();

}


class Rectangle extends Shape{
  double height;
  double width;

  public Rectangle(double h, double w){
    this.height = h;
    this.width = w;
  }

  @Override
  public void calculateArea() {
    System.out.println(this.height * this.width);
  }
}

class Circle extends Shape{
  double radius;
  public Circle(double r){
     this.radius = r;
  }
  @Override
  public void calculateArea() {
    System.out.println(3.14*radius*radius);
  }
}



class AreaCalculator {
  // Method
  public void calculate (Shape shape) {
    shape.calculateArea();
  }
}


// Driver class.
public class Area {
  public static void main(String[] args) {
    
    AreaCalculator cal = new AreaCalculator();
    // Added the rectangle constructor here to calculate the area.
    cal.calculate(new Rectangle(3, 5));
  }
}
