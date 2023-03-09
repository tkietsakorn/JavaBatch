import java.io.Serializable;

public class Dog implements Serializable{
	
	private String name;
	public String breed;
	String color;
	protected int age;
	
//	Access Modifier:
//	private<default<protected<public
	
	public void eat() {
		System.out.println("Dog is Eating!");
	}
	
	public void sleep() {
		System.out.println("Dog is Sleeping!");
	}
	
	public void profile() {
		System.out.println("Name: "+name+" ,breed: "+breed);
	}
	
	public Dog(String name, String breed, String color, int age) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	public Dog() {
		
	}
	
	public static void main(String[] args) {
		Dog dogObj = new Dog();
		dogObj.name = "Jimmy";
		dogObj.breed = "Labra";
		dogObj.age = 10;
		dogObj.color = "black";
		
		dogObj.eat();
		dogObj.sleep();
		dogObj.profile();
		
		Dog dogWithContruct = new Dog("Jack","German","White",10);
		dogWithContruct.eat();
		dogWithContruct.profile();
		

	}

}
