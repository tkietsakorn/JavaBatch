class Parent{
	
	int a = 10;
	protected void displayMethod() {
		System.out.println("From Parent Class");
	}
	
	static class NestedClass{
		
	}
}
class Child extends Parent{
	
	int a = 20;
	public void displayMethod() {
		super.displayMethod();
		System.out.println("From Child Class");
	}
	
	public static void printName() {
		System.out.println("Java");
	}
}

public class MethodOverriding {
	
	static{
		System.out.println("I am Static Block");
	}
	public static void main(String[] args) {
		
		Parent parentObj = new Parent();
		System.out.println(parentObj.a);
		parentObj.displayMethod();
		System.out.println(parentObj.toString());
		
		Child childObj = new Child();
		System.out.println(childObj.a);
		childObj.displayMethod();
		
		Parent parentRef = new Child();
		System.out.println(parentRef.a);
		parentRef.displayMethod();
		
		//Compilation Error
//		Child childRef = new Parent();
		
		Child.printName();
		
	}
	

}
