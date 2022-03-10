package exo4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagramme anag = new Anagramme();
		System.out.println("Paul et Ngolo? :  " + anag.isAnagramme("Paul","Ngolo"));
		System.out.println("Boris Vian et Bison ravi? :  " + anag.isAnagramme("Boris Vian","Bison ravi"));
	}

}
