
public class TestThread extends Thread{
	//exercice 2.1
	public TestThread(String name) {
		super(name);
	}
	
	public  void run() {
		for(int i = 0; i<5; i++)
			System.out.print(this.getName());
	}
	
	public static void main(String[] args) {
		
		try {
			TestThread t = new TestThread("1-");
			TestThread t2 = new TestThread("2--");	
			TestThread t3 = new TestThread("3---");		
			TestThread t4 = new TestThread("4----");		
			TestThread t5 = new TestThread("5-----");
			
			t.start();
			t.join();
			t3.start();
			t3.join();
			t4.start();
			t4.join();
			t2.start();	
			t2.join();			
			t5.start();
			t5.join();
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}

}
