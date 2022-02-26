package com;

public class EsempioIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variabili che rappresentano voti conseguiti
		int votoScritto = 7;
		int votoOrale = 5;
		//totale dei voti
		int totale = votoScritto + votoOrale;
		// calcolo della media
		int media = totale/2;
		// stampa della media
		System.out.println("Media dei voti: "+media);
		if(media>=6)
		System.out.println("Promosso");
		else
		System.out.println("Bocciato");
	}

}
