class Animail{
	String name;
	int age;
	
	public void eat() {
		System.out.println("I am Eating!");
	}
	public void printCharacteristics() {
		System.out.println("Name: "+name+" age: "+age);
	}
}

class Animal1{
	int age;
	
	public void eat() {
		System.out.println("I am Eating!");
	}
}

class DogAnimal extends Animail{
	
}
class CatAnimal extends Animail{
	
}

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		DogAnimal dog = new DogAnimal();
		dog.name = "Tommy";
		dog.age= 5;
		dog.eat();
		dog.printCharacteristics();
		
		CatAnimal cat = new CatAnimal();
		cat.name="Kitty";
		cat.printCharacteristics();

		
	}

}
