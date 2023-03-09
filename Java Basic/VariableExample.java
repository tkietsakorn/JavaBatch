class Employee{
	
	String name;
	int age;
	String department;
	static int countOfEmployee;
	
	public void isWorking() {
		System.out.println("Employee is Working!");
	}
	
	public Employee(){
		
	}
	
	public Employee(String name,int age, String department) {
		this.name = name;
		this.age =age;
		this.department=department;
	}
	
	
}


public class VariableExample {
	
	public static void main(String[] args) {
		
		
		boolean booleanVariable;
		
		int a = 10;
		
		Employee empObj = new Employee();
		System.out.println(empObj.name+" "+empObj.age);
		empObj.countOfEmployee =  empObj.countOfEmployee+1;
		System.out.println(empObj.countOfEmployee);
		
		Employee empObj2 = new Employee();
		System.out.println(empObj.name+" "+empObj.age);
		empObj2.countOfEmployee =  empObj2.countOfEmployee+1;
		System.out.println(empObj2.countOfEmployee);
		
		
		Employee empObj3 = new Employee("Jack",25,"Software");
		System.out.println(empObj3.name+" "+empObj3.age);

	}

}
