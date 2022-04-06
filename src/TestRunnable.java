//exercice 2.2
public class TestRunnable implements Runnable{
	public String s="";
		@Override
		public void run() {
			for(int i = 0; i < 10 ; i++) {					
				s += "*";
				System.out.print(s.concat("\n"));
			}
		}		
		public static void main(String[] args) {
			Thread thread = new Thread(new TestRunnable());
			thread.start();
			
		}

}
