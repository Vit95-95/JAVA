package EserciziIf;
import java.util.Scanner;
public class Esercizio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Immetti un'anno: ");
		int anno = scan.nextInt();
		
		if(anno%400 == 0) {
			System.out.println("il "+ anno +" è un'anno bisestile");
		}else {
			System.out.println("il "+ anno +" non è un'anno bisestile");
		}

	}

}
