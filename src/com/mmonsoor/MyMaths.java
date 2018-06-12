package com.mmonsoor;

public class MyMaths {

	public static int add(int nombre1, int nombre2) {
		//Pour l'ajout de deux nombres positifs
		int result=nombre1;
		for(int i=0;i<nombre2;i++) {
			result++;
		}
		return result;	
	}
	public static int substract(int nombre1, int nombre2) {
		return 0;
		
	}
	public static int multiply(int nombre1, int nombre2) {
		return 0;
	}
	public static int divide (int a, int b) throws ArithmeticException {
		int resultat = 0;


		boolean inversionResultat = false;
		if(b==0) {
			throw new ArithmeticException();
		}

		if(a < 0 && b < 0)
		{
			a = -a;
			b = -b;
		}

		if(a < 0 || b < 0)
		{
			if(a < 0)
			{
				a = -a;
			}
			if(b < 0)
			{
				b = -b;
			}
			inversionResultat = true;
		}
		int valeurIntermediaire = a;

		while(valeurIntermediaire >= b)
		{
			valeurIntermediaire = substract(valeurIntermediaire,b);
			resultat++;
		}

		if(inversionResultat)
		{
			resultat = -resultat;
		}

		return resultat;
	}
	
}
