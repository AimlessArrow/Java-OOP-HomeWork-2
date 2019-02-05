package main;

public class Circle extends Shape {
	  /* A circle center coordinates */
	  private Point centerPoint;
	  /* A point on a surface of the circle */
	  private Point circlePoint;
	  
	  public Circle() {
	    this.centerPoint = new Point(0, 0);
	    this.circlePoint = new Point(0, 0);
	  }
	  
	  public Circle(Point newCenterPoint, Point newCirclePoint) {
	    if(newCenterPoint == null || newCirclePoint == null) {
	      throw new IllegalArgumentException("Incorrect input");
	    } else {
	      this.centerPoint = newCenterPoint;
	      this.circlePoint = newCirclePoint;
	    }
	  }

	  public void setCenterPoint(double newX, double newY) {
	    this.centerPoint.setX(newX);
	    this.centerPoint.setY(newY);
	  }
	  
	  public void setCirclePoint(double newX, double newY) {
	    this.circlePoint.setX(newX);
	    this.circlePoint.setY(newY);
	  }
	  
	  public Point getCenterPoint() {
	    return this.centerPoint;
	  }
	  
	  public Point getCirclePoint() {
	    return this.circlePoint;
	  }
	  
	  public double getPerimeter() {
	    double radious = this.centerPoint.findDistance(this.circlePoint);
	    double perimeter = 2 * Math.PI * radious;
	    return perimeter;
	  }
	  
	  public double getArea() {
	    double radious = this.centerPoint.findDistance(this.circlePoint);
	    double area = Math.PI * Math.pow(radious, 2);
	    return area;
	  }
	  
	  @Override
	  public String toString() {
	    return "Circle [centerPoint=" + this.centerPoint 
	      + ", circlePoint=" + this.circlePoint + "]";
	  }
	}