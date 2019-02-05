package main;

public class Point {
	  private double x;
	  private double y;
	  
	  public Point() {
	    this.x = 0;
	    this.y = 0;
	  }
	  
	  public Point(double newX, double newY) {
	    this.x = newX;
	    this.y = newY;
	  }
	  
	  public void setX(double newX) {
	    this.x = newX;
	  }
	  
	  public void setY(double newY) {
	    this.y = newY;
	  }
	  
	  public double getX() {
	    return this.x;
	  }
	  
	  public double getY() {
	    return this.y;
	  }
	  
	  public void setXY(double newX, double newY) {
	    this.x = newX;
	    this.y = newY;
	  }
	  
	  public double findDistance(Point destination) {
	    double distance = Math.sqrt(Math.pow((destination.getX() - this.x), 2) + Math.pow((destination.getY() - this.y), 2));
	    return distance;
	  }
	  
	  @Override
	  public String toString() {
	    return "Point [x=" + this.x + ", y=" + y + "]";
	  }
}