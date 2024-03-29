
//exercie 2.3
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

  public static void main(String[] args) {
    Thread thread = new Thread(new MonRunnable(1000));
   

   // System.out.println(df.format(new Date()));

    thread.start();
    
  }
  public static void cls() {
		for(int i = 0 ; i <29 ; i++)
			System.out.println("");
  }
  
  private static class MonRunnable implements Runnable {

    private long delai;

    public MonRunnable(long delai) {
      this.delai = delai;
    }
    
    @Override
    public void run() {
    	DateFormat df = new SimpleDateFormat("HH:mm:ss");
    	while(true) {
	      try {
	       Thread.sleep(delai);
	       cls();
	       System.out.println(df.format(new Date()));	  
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
    	}
    }
  }
}