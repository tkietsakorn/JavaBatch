
public class MethodOverloading {
	
	public int sum(int a, int b) {
		return (a+b);
	}
	
	
	public double sum(double a, double b, double c) {
		return (a+b+c);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading methodOverloadingObj = new MethodOverloading();
		System.out.println(methodOverloadingObj.sum(10, 20));
		System.out.println(methodOverloadingObj.sum(10.0, 20.0, 30.0));
		System.out.println(methodOverloadingObj.sum(30, 40, 50));
//		System.out.println(methodOverloadingObj.sum(30.0, 40.0));

		
	}

}
