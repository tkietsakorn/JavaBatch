
public class ExceptionDemo {
	
	public static void main(String[] args) {
		try {
			computeDivision(10);
			throw new UsernameNotFoundException("This is thrown using throw keyword");
			
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("Arithmetic Exception message: "+e.getMessage());
		}catch(UsernameNotFoundException e) {
			System.out.println("UsernameNotFound Exception message: "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception message: "+e.getMessage());
		}finally {
			System.out.println("I am in Finally block");
		}
		
		System.out.println("Rest of Code");
		
		
		
	}
	
	public static void computeDivision(int number) throws ClassNotFoundException{
		int x = 100/number;
		System.out.println(x);
		
		throw new ClassNotFoundException();
	}

}
