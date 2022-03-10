package exo1;
import java.math.BigInteger;

public class Factorielle {
	public int x;
	
	public Factorielle() {
	}
	
	public int factorielle(int nbr1) {
		this.x = nbr1;
		for (int i=nbr1-1; i>0; i--) {
			this.x = this.x * i;
		}
		return this.x;
	}
	
	public int intFactorielle(int nbr2) {
		this.x = nbr2;
		for (int i=nbr2-1; i>0; i--) {
			this.x = this.x * i;
		}
		return (int) this.x;
	}
	
	public double doubleFactorielle(int nbr3) {
		this.x = nbr3;
		for (int i=nbr3-1; i>0; i--) {
			this.x = this.x * i;
		}
		return (double) this.x;
	}
	
	public BigInteger bigIntFactorielle(int nbr4) {
		this.x = nbr4;
		for (int i=nbr4-1; i>0; i--) {
			this.x = this.x * i;
		}
		BigInteger bigInteger = BigInteger.valueOf(this.x);
		return bigInteger;
	}
}
