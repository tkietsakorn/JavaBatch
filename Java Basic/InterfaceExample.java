import java.util.Scanner;

interface Shape{
	void draw();
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am drawing Circle");
	}
	
}

class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("I am drawing Square");
	}
	
}

class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("SQUARE"))
			return new Square();
		return null;
	}
}


public class InterfaceExample {
	
	public static void main(String[] args) {
		Square squareShape = new Square();
		squareShape.draw();
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
//		Square
//		Circle
		

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Shape");
		String shapeType = scanner.nextLine();
		Shape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();
	}
	

	
	

}
