package com;
import java.util.Scanner;


public class EsempioInputDaTastiera2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("dammi un numero x: ");
		
		int x = scan.nextInt();
		
		System.out.println("dammi un numero y: ");
		
		int y = scan.nextInt();
		
		int somma = x + y;
		
		System.out.println("la somma è: "+ somma);
		
	}

}
