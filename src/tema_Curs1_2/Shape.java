package tema_Curs1_2;

public class Shape {
	
	
	public Shape(int length) {
		System.out.println("The area of the square is " + length*length);
		
	}
	
	
	public Shape (int length, int width) {
		System.out.println("The area of the rectangle is " + length*width);
		
	}
	
	public Shape (double radius) {
		 System.out.println("The area of the circle is " + radius*radius*Math.PI);
	}
	
	

	public int calculateSquareArea(int length) {
		 return length*length;
		
	}
	
	public int calculateRectangleArea(int length, int width) {
		
		return length*width;
	}
	
	

	
}
