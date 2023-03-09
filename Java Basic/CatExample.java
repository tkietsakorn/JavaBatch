class Animal{
	
//	private<default<protected<public
	private String balance;
	
	public String name;
	protected String color;
	public int age;
	
	public void run() {
		System.out.println("I am Running");
	}
	
	public void scream() {
		System.out.println("I am Screaming");
	}
	public void display() {
		System.out.println("Name = "+name+" Color= "+color+" Age= "+age);
	}

	public String getName() {
		
		return balance;
	}

	private void setName(String name) {
		this.balance = balance;
	}
	
	
}


public class CatExample {
	
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.name = "Jimmy";
		cat.age=2;
		cat.color="White";
		
	}

}
