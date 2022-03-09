package exo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorielle fact = new Factorielle();
		System.out.println("Factorielle de 10 = " + fact.intFactorielle(10));
		System.out.println("Factorielle de 10 = " + fact.doubleFactorielle(10));
		System.out.println("Factorielle de 10 = " + fact.bigIntFactorielle(10));
		
		System.out.println("Factorielle de 13 = " + fact.intFactorielle(13));
		System.out.println("Factorielle de 13 = " + fact.doubleFactorielle(13));
		System.out.println("Factorielle de 13 = " + fact.bigIntFactorielle(13));
		
		System.out.println("Factorielle de 25 = " + fact.intFactorielle(25));
		System.out.println("Factorielle de 25 = " + fact.doubleFactorielle(25));
		System.out.println("Factorielle de 25 = " + fact.bigIntFactorielle(25));
	}

}
