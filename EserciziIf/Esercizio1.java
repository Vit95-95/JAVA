package EserciziIf;
import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("insierisci il primo numero");
        int primo = scan.nextInt();
        System.out.println("inserisci il secondo numero");
        int secondo = scan.nextInt();
        
        if(primo>secondo)
        	System.out.println("il primo numero è più grande del secondo");
        if(secondo>primo)
        	System.out.println("il secondo numero è più grande del primo");
        
	}

}
