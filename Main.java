public class Main {
  public static void main(String args[]) {
    /* Circle */
    Point circleA = new Point(8, 9);
    Point circleB = new Point(2, 2);
    Circle myCircle = new Circle(circleA, circleB);
    double circlePerimeter = myCircle.getPerimeter();
    double circleArea = myCircle.getArea();
    System.out.println("Perimeter of the circle: " + circlePerimeter);
    System.out.println("Area of the circle: " + circleArea);
    
    /* Square */
    Point squareA = new Point(5, 6);
    Point squareB = new Point(12, 6);
    Point squareC = new Point(12, 3);
    Point squareD = new Point(5, 3);
    Square mySquare = new Square(squareA, squareB, squareC, squareD);
    double squarePerimeter = mySquare.getPerimeter();
    double squareArea = mySquare.getArea();
    System.out.println("Perimeter of the square: " + squarePerimeter);
    System.out.println("Area of the square: " + squareArea);
    
    /* Triangle */
    Point triangleA = new Point(5, 5);
    Point triangleB = new Point(8, 7);
    Point triangleC = new Point(8, 10);
    Triangle myTriangle = new Triangle(triangleA, triangleB, triangleC);
    double trianglePerimeter = myTriangle.getPerimeter();
    double triangleArea = myTriangle.getArea();
    System.out.println("Perimeter of the triangle: " + trianglePerimeter);
    System.out.println("Area of the triangle: " + triangleArea);
    
    /* Tetragon */
    Point tetragonA = new Point(4, 5);
    Point tetragonB = new Point(10, 7);
    Point tetragonC = new Point(11, 3);
    Point tetragonD = new Point(3, 3);
    Tetragon myTetragon = new Tetragon(tetragonA, tetragonB, tetragonC, tetragonD);
    double tetragonPerimeter = myTetragon.getPerimeter();
    double tetragonArea = myTetragon.getArea();
    System.out.println("Perimeter of the tetragon: " + tetragonPerimeter);
    System.out.println("Area of the tetragon: " + tetragonArea);
    
    /* Board */
    Board myBoard = new Board();
    myBoard.addShape(myTetragon, 0);
    myBoard.addShape(myCircle, 3);
    myBoard.showContents();
  }
}