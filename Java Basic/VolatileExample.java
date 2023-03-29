
public class VolatileExample {
	
	private static int a = 0;
	
	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}
	
	static class ChangeListener extends Thread{
		public void run() {
			int local = a;
			while(local<5) {
				if(local != a) {
					System.out.println("Got Change for a: "+a);
					local = a;
				}
			}
			
		}
	}
	
	static class ChangeMaker extends Thread{
		public void run() {
			int local = a;
			
			while(local<5) {
				System.out.println("Incrementing a to "+(local+1));
				a = ++local;
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}



