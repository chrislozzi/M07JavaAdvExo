import java.util.Date;

public class FoundException {

	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		
		
		
		//Exercice 1.1
		//date.getClass() leve l'exception : java.lang.NullPointerException, nous devons la capturer 
		//afin de permettre � l'instruction suivant de s'executer
		try {
		//
		System.out.println(date.getClass().getName());
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("exception captur�e :" + e);
		}
		
		System.out.println(today.getClass().getName());
	}
	
}
