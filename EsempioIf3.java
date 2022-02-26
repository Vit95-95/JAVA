package com;

public class EsempioIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int etaStudente = 20;
		boolean studenteUniversitario = true;
		if(studenteUniversitario) 
		{
			System.out.println("Studente maggiorenne, può entrare");
		}
		else if(etaStudente<18)
		{
			System.out.println("Studente minorenne, NON può entrare");
		}
		else
			System.out.println("Studente maggiorenne, può entrare");
	}

}
