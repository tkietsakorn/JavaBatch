class ThreadA extends Thread{
	
	public void run(){
		System.out.println("ThreadA: "+Thread.currentThread());
		for(int i=0;i<20;i++) {
			System.out.println("ThreadA class with i= "+i);
		}
	}
	
}
class ThreadB extends Thread{
	public void run(){
		System.out.println("ThreadB: "+Thread.currentThread());
		for(int i=0;i<20;i++) {
			System.out.println("ThreadB class with i= "+i);
		}
	}
}
class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadRunnable: "+Thread.currentThread());
		for(int i=0;i<20;i++) {
			System.out.println("ThreadRunnable class with i= "+i);
		}
	}
	
}

public class ThreadBasicExample {
	
	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.setDaemon(true);
		System.out.println(threadA.isDaemon());
		threadA.start();
		threadB.start();
		threadA.setPriority(10);
		
		ThreadRunnable threadRunnable = new ThreadRunnable();
		Thread threadFromRunnable = new Thread(threadRunnable);
		
		threadFromRunnable.start();
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
	}

}
