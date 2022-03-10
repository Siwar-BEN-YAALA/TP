package exo3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pal = new Palindrome();
		System.out.println("Rions noir est palindrome? :  " + pal.palindrome("Rions noir"));
		System.out.println("Esope reste ici et se repose est palindrome? :  " + pal.palindrome("Esope reste ici et se repose"));
		System.out.println("Elu par cette crapule est palindrome? :  " + pal.palindrome("Elu par cette crapule"));
		System.out.println("Et la marine va venir a Malte est palindrome? :  " + pal.palindrome("Et la marine va venir a Malte"));
		System.out.println("Severe, dissuasive, je vis aussi de reves est palindrome? :  " + pal.palindrome("Severe, dissuasive, je vis aussi de reves"));
	}

}
