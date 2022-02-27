package EserciziIf;
import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" inserisci il numero a: ");
		double a = scan.nextDouble();
		System.out.println(" inserisci il numero b: ");
		double b = scan.nextDouble();
		System.out.println(" inserisci il numero c: ");
		double c = scan.nextDouble();
		
		double lamda = (b*b) - 4*a*c;
		double x1 = 0.0;
		double x2 = 0.0;
		double x = 0.0;
		
		if(lamda>0) {
			x1 = (-b + Math.sqrt(lamda))/2*a;
		    x2 = (-b - Math.sqrt(lamda))/2*a;
		    System.out.println("Le soluzioni dell'equazione di secondo grado sono: ");
		    System.out.println(x1);
		    System.out.println(x2);
		}
		if(lamda==0) {
			x = -b/2*a;
			System.out.println("La soluzione dell'equazione di secondo grado è: "+ x);
		}
		if(lamda<0) {
			System.out.println("equazione impossibile");
		}
		

	}

}
