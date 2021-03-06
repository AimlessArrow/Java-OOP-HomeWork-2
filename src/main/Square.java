package main;

public class Square extends Shape {
	  private Point a;
	  private Point b;
	  private Point c;
	  private Point d;
	  
	  public Square() {
	    this.a = new Point(0, 0);
	    this.b = new Point(0, 0);
	    this.c = new Point(0, 0);
	    this.d = new Point(0, 0);
	  }
	  
	  public Square(Point newA, Point newB, Point newC, Point newD) {
	    if(newA == null || newB == null || newC == null || newD == null) {
	      throw new IllegalArgumentException("Incorrect input");
	    } else {
	      this.a = newA;
	      this.b = newB;
	      this.c = newC;
	      this.d = newD;
	    }
	  }

	  public void setA(double newX, double newY) {
	    this.a.setX(newX);
	    this.a.setY(newY);
	  }
	  
	  public void setB(double newX, double newY) {
	    this.b.setX(newX);
	    this.b.setY(newY);
	  }
	  
	  public void setC(double newX, double newY) {
	    this.c.setX(newX);
	    this.c.setY(newY);
	  }
	  
	  public void setD(double newX, double newY) {
	    this.d.setX(newX);
	    this.d.setY(newY);
	  }
	  
	  public Point getA() {
	    return this.a;
	  }
	  
	  public Point getB() {
	    return this.b;
	  }

	  public Point getC() {
	    return this.c;
	  }
	  
	  public Point getD() {
	    return this.d;
	  }
	  
	  public double getPerimeter() {
	    double sideAB = this.a.findDistance(this.b);
	    double perimeter = sideAB * 4;
	    return perimeter;
	  }
	  
	  public double getArea() {
	    double sideAB = this.a.findDistance(this.b);
	    double area = sideAB * sideAB;
	    return area;
	  }
	  
	  @Override
	  public String toString() {
	    return "Square [a=" + this.a + ", b=" + this.b 
	      + ", c=" + this.c + ", d=" + this.d + "]";
	  }
}