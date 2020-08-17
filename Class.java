package theRectangle;

public class Class {

	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle();
		System.out.println(myRectangle);
		System.out.println("MyRectangle's area is " + myRectangle.getArea());
		System.out.println("MyRectangle's perimeter is " + myRectangle.getPerimeter());
		//the second rectangle
		myRectangle = new Rectangle(9,8);
		System.out.println(myRectangle);
		System.out.println("MyRectangle's area is " + myRectangle.getArea());
		System.out.println("MyRectangle's perimeter is " + myRectangle.getPerimeter());
	}//end of main

}//end of class
