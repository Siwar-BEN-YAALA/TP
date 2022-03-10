package exo2;

public class Bissextile {
	public int annee;

	public Bissextile() {
	}

	public boolean bissextile(int x) {
		if((x%4 == 0 && x%100!=0)||(x%400==0)) {
			return true;
		}
		else
			return false;
	}
}
