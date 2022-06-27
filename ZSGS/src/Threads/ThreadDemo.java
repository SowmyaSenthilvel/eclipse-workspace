package Threads;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println("Thread 1");
		}
		
	}
	public void start() {
		System.out.println("It starts");
	}

	public static void main(String[] args) {
		
		ThreadDemo td=new ThreadDemo();
		
		for(int i=1;i<=50;i++) {
			System.out.println("Main Thread ");
		}
		td.run();
		td.start();
	}

}
