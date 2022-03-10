package exo6;

public class User {
	private String nom;
	private String prenom;
	private int salaire;
	
	public User() {
	}
	
	public User(String nom, String prenom, int salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	public User(String nom, int salaire) {
		this(nom, "", salaire);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	public void raise(int raise) {
		this.salaire+=raise;
	}
	
	public boolean equals(Object o) {
		User u = (User) o;
        return nom.equals(u.nom) && prenom.equals(u.prenom) && (salaire == u.salaire);
    }
}