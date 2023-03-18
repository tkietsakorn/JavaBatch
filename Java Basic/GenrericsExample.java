class Test<T>{
	
	T obj;
	Test(T obj){
		this.obj = obj;
	}
	public T getObject() {
		return this.obj;
	}
	
}


public class GenrericsExample {
	
	public static void main(String[] args) {
		
		Test<Integer> integerObject = new Test<Integer>(15);
		System.out.println(integerObject.getObject());
		
		Test<String> stringObject = new Test<String>("JavaCourse");
		System.out.println(stringObject.getObject());
		
//		System.out.println(integerObject==stringObject);
		
	}

}
