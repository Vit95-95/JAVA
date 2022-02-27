package EserciziIf;
import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("immettere un numero di mese: ");
		int mese = scan.nextInt();
		
		if(mese == 1)
			System.out.println("Gennaio ha 31 giorni");
		if(mese == 2)
			System.out.println("Febbraio ha 28 giorni");
		if(mese == 3)
			System.out.println("Marzo ha 31 giorni");
		if(mese == 4)
			System.out.println("Aprile ha 30 giorni");
		if(mese == 5)
			System.out.println("Maggio ha 31 giorni");
		if(mese == 6)
			System.out.println("Giugno ha 30 giorni");
		if(mese == 7)
			System.out.println("Luglio ha 31 giorni");
	    if(mese == 8)
	    	System.out.println("Agosto ha 31 giorni");
		if(mese == 9)
			System.out.println("Settembre ha 30 giorni");
		if(mese == 10)
			System.out.println("Ottobre ha 31 giorni");
		if(mese == 11)
			System.out.println("Novembre ha 30 giorni");
		if(mese == 12)
			System.out.println("Dicembre ha 31 giorni");
	}

}
