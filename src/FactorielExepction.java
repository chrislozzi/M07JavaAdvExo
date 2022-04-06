import java.util.Scanner;
//Exercice 1.2 gestion d'une erreur de saisie, je n'ai pas reussis à gérer le java.lang.StackOverflowError
public class FactorielExepction {
	public static long fact(long n){
		
		if( n <= 0) {
			return 1;
			}
		else {
			return n*fact(n -1) ;//appel récursif
		}
	}

	public static void main(String[] args) {
		Long n = 0L;
		System.out.println("Entrez un entier pour calculer n!");
		try {
		Scanner scan = new Scanner(System.in);
		n = scan.nextLong();
		}
		catch( java.util.InputMismatchException e) {
			System.out.println("exception int attendue : " + e);
		}
		System.out.println( n +"! = " + fact(n));
	}

}
