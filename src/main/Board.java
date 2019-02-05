package main;

public class Board {
	  private Shape[] shapeArray = new Shape[4];
	  
	  public Board() {}
	  
	  public void addShape(Shape newShape, int index) {
	    if(index < 0 && index >= 4) {
	      System.out.println("Incorrect index");
	    } else if(shapeArray[index] == null) {
	      shapeArray[index] = newShape;
	    } else {
	      System.out.println("The area is already occupied");
	    }
	  }
	  
	  public void removeShape(int index) {
	    if(shapeArray[index] == null) {
	      System.out.println("The area is already vacant");
	    } else {
	      shapeArray[index] = null;
	    }
	  }
	  
	  public void showContents() {
	    double totalArea = 0;
	    for(int i = 0; i < 4; i++) {
	      if(shapeArray[i] == null) {
	        System.out.println(i + " is vacant");
	      } else {
	        System.out.println(i + " is " + shapeArray[i]);
	        totalArea = totalArea + shapeArray[i].getArea();
	        System.out.println("Area is " + shapeArray[i].getArea());
	      }
	    }
	    System.out.println("Total area is " + totalArea);
	  }  
	}