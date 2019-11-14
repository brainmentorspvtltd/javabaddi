class Shape{
	
	void area() {
		System.out.println("Shape area");
	}
	
	void perimeter() {
		System.out.println("Shape perimeter");
	}
	
}

class Rectangle extends Shape{
	@Override
	void area() {
		System.out.println("Area of rectangle");
	}
	void draw() {
		System.out.println("Length n breadth rect");
	}
}

class Square extends Shape{
	void allSidesEqual() {
		System.out.println("Length n breadth are same");
	}
}
class Drawing{
	void print(Shape shape) {
		shape.area();
		shape.perimeter();
		if(shape instanceof Square) {
			Square square = (Square)shape;
			square.allSidesEqual();
		}
		
		if(shape instanceof Rectangle) {
			Rectangle rect = (Rectangle)shape;
			rect.draw();
		}
	}
}
public class ShapeDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawing draw = new Drawing();
		draw.print(new Shape());
		draw.print(new Rectangle());
	}

}
