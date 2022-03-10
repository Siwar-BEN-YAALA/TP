package exo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bissextile biss = new Bissextile();
		System.out.println("1900 est bissextile? :  " + biss.bissextile(1900));
		System.out.println("1901 est bissextile? :  " + biss.bissextile(1901));
		System.out.println("1996 est bissextile? :  " + biss.bissextile(1996));
		System.out.println("2000 est bissextile? :  " + biss.bissextile(2000));
	}

}
