package theRectangle;

public class Rectangle extends Class{
	private int width;
	private int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return height;
	}
	public void setLength(int height) {
		this.height = height;
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}
	public double getArea() {
		double area;
		area = width * height;
		return area;
	}//end of getArea
	public double getPerimeter() {
		double perimeter;
		perimeter = 2*(width + height);
		return perimeter;
	}//end of getArea
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	

}
