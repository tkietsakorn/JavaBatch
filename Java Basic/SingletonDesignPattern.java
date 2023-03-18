
public class SingletonDesignPattern {
	
	private static SingletonDesignPattern instance;
	
	private SingletonDesignPattern(){
		
	}
	
	public static SingletonDesignPattern getInstance() {
		synchronized(SingletonDesignPattern.class) {
			

		if(instance == null) {
			instance = new SingletonDesignPattern();
		}
		}
		return instance;
	}


}
class SingletonDesignPatternExample{
	public static void main(String[] args) {
//		SingletonDesignPattern obj = new SingletonDesignPattern();
		
		SingletonDesignPattern.getInstance();
		
	}
}
