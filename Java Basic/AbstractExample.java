abstract class CentralBank{
	
	abstract void deposit(int amount);
	abstract void withdrawl(int amount);
	
	public void creditScore() {
		System.out.println("I m checking Credit Score");
	}
}

class MauritiusBank extends CentralBank{

	@Override
	void deposit(int amount) {
		System.out.println("I am performing Deposit");
	}

	@Override
	void withdrawl(int amount) {
		System.out.println("I am performing Withdrawl");
		
	}
	
}

class SingaporeBank extends CentralBank{

	@Override
	void deposit(int amount) {
		System.out.println("I am performing Deposit in Singapore Bank");
	}

	@Override
	void withdrawl(int amount) {
		System.out.println("I am performing Withdrawl in Singapore Bank");
		
	}
	
}

public class AbstractExample {

}
