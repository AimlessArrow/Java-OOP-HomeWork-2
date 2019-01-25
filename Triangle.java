public class Triangle extends Shape {
  private Point a;
  private Point b;
  private Point c;
  
  public Triangle() {
    this.a = new Point(0, 0);
    this.b = new Point(0, 0);
    this.c = new Point(0, 0);
  }
  
  public Triangle(Point newA, Point newB, Point newC) {
    if(newA == null || newB == null || newC == null) {
      throw new IllegalArgumentException("Incorrect input");
    } else {
      this.a = newA;
      this.b = newB;
      this.c = newC;
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
  
  public Point getA() {
    return this.a;
  }
  
  public Point getB() {
    return this.b;
  }

  public Point getC() {
    return this.c;
  }
  
  public double getPerimeter() {
    double sideAB = this.a.findDistance(this.b);
    double sideBC = this.b.findDistance(this.c);
    double sideAC = this.a.findDistance(this.c);
    double perimeter = sideAB + sideBC + sideAC;
    return perimeter;
  }
  
  public double getArea() {
    double sideAB = this.a.findDistance(this.b);
    double sideBC = this.b.findDistance(this.c);
    double sideAC = this.a.findDistance(this.c);
    double p = (sideAB + sideBC + sideAC)/2;
    double area = Math.sqrt(p*(p - sideAB)*(p - sideBC)*(p - sideAC));
    return area;
  }
  
  @Override
  public String toString() {
    return "Square [a=" + this.a + ", b=" + this.b + ", c=" + this.c + "]";
  }
}