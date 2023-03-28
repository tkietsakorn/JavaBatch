class Sender{
	public void send(String msg) {

		synchronized(this){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n"+msg+" sent");
		}
	}
}

class ThreadSend extends Thread{
	private String msg;
	
	Sender sender;
	
	ThreadSend(String msg, Sender sender){
		this.msg = msg;
		this.sender = sender;
	}
	
	public void run() {
		sender.send(msg);
	}
}

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		Sender send  = new Sender();
		
		ThreadSend s1 = new ThreadSend("Hi ", send);
		ThreadSend s2 = new ThreadSend("Bye ", send);
		ThreadSend s3 = new ThreadSend("Hi 2 ", send);
		ThreadSend s4 = new ThreadSend("Bye 2 ", send);
		
		try {
			s1.start();
			s1.join();
			
			s2.start();
			s2.join();

			s3.start();
			s3.join();

			s4.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
	}

}
