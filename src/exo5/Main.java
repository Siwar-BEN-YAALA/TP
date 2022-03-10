package exo5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User("AA","aa",1);
		User u2 = new User("AA","aa",1);
		User u3 = new User("BB","bb",2);
		
		u1.affiche(u1);
		u2.affiche(u2);
		u3.affiche(u3);
		
		System.out.println("u1 = u2 ? : "+u1.equals(u2));
		System.out.println("u1 = u3 ? : "+u1.equals(u3));
		System.out.println("u2 = u3 ? : "+u2.equals(u3));
		
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
		
		if(u1.getNom().compareTo(u2.getNom()) != 0) {
			if(u1.getNom().compareTo(u2.getNom()) > 0)
				System.out.println("u1 > u2");
			else
				System.out.println("u1 < u2");
		}
		else if(u1.getNom().compareTo(u2.getNom()) == 0) {
			if(u1.getPrenom().compareTo(u2.getPrenom()) != 0) {
				if(u1.getPrenom().compareTo(u2.getPrenom()) > 0)
					System.out.println("u1 > u2");
				else
					System.out.println("u1 < u2");
			}
			else if(u1.getPrenom().compareTo(u2.getPrenom()) == 0) {
				if(u1.getSalaire() != u2.getSalaire()) {
					if(u1.getSalaire() > u2.getSalaire())
						System.out.println("u1 > u2");
					else
						System.out.println("u1 < u2");
				}
			}
			System.out.println("u1 = u2");
		}
	}
}
