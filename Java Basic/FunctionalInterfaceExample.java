@FunctionalInterface
interface FunctInterface{
	public int getSum(int a, int b);
//	public int getSum1(int a, int b);

	default void printString() {
		System.out.println("I am default Method");
	}
}

class FunctInterfaceImpl implements FunctInterface{

	@Override
	public int getSum(int a, int b) {
		return (a+b);
	}
	
}
class FunctInterfaceImple implements FunctInterface{

	@Override
	public int getSum(int a, int b) {
		return (a+b);
	}
	
}


public class FunctionalInterfaceExample {
	
	public static void main(String[] args) {
		//Normal Approach - Subclass implementing Interface
//		FunctInterfaceImpl functInterfaceImplObj = new FunctInterfaceImpl();
//		functInterfaceImplObj.printString();
//		System.out.println(functInterfaceImplObj.getSum(10, 20));
//		
//		
//		FunctInterface interfRef = new FunctInterface() {
//			
//			@Override
//			public int getSum(int a, int b) {
//				return (a+b);
//			}
//		};
//		interfRef.printString();
//		System.out.println(interfRef.getSum(10, 20));
//		
//		
//		FunctInterface interfRefere = new FunctInterface() {
//			
//			@Override
//			public int getSum(int a, int b) {
//				return (a+b)*10;
//			}
//		};
//		interfRefere.printString();
//		System.out.println(interfRefere.getSum(10, 20));
//		
//		FunctInterface interfReference = new FunctInterface() {
//			
//			@Override
//			public int getSum(int a, int b) {
//				return (a+b)*20;
//			}
//		};
//		(Argument List) -> {Body}
		FunctInterface lamdaRef = (a,b) -> {
			return (a+b);
			};
		FunctInterface lamdaRefe = (a,b) -> {return (a+b)*10;};

		lamdaRef.printString();
		System.out.println(lamdaRef.getSum(10, 20));
	}

}
