package EserciziIf;
import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("inserisci il primo numero");
		
		int primo = scan.nextInt();
		
		System.out.println("inserisci il secondo numero");
		
		int secondo = scan.nextInt();
		
		System.out.println("inserisci il terzo numero");
		
		int terzo = scan.nextInt();
		
		int maggiore = primo; // inizialmente maggiore è uguale al primo numero inserito
		
		if(secondo>maggiore)
			maggiore = secondo;
		
		if(terzo>maggiore)
			maggiore = terzo;
		
		System.out.println("il numero maggiore è: "+ maggiore);
		
		}
}
