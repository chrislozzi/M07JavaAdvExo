import java.util.Date;

public class FoundException {

	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		
		
		
		//Exercice 1.1
		try {
		
		System.out.println(today.getClass().getName());
		System.out.println(date.getClass().getName());
		
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("exception capturée :" + e);
		}
		
		System.out.println(today.getClass().getName());
	}
	
}
