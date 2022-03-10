package exo6;

public class UserUtil {
	User [] users = null;
	
	public UserUtil() {
	}

	public void raise(User [] users, int percentage) {
		for(int i=0; i<users.length; i++)
			users[i].setSalaire(users[i].getSalaire() + percentage);
	}
	
	public int getMaxSalary(User [] users) {
		int max=users[0].getSalaire();
		for(int i=1; i<users.length; i++) {
			if(users[i].getSalaire()>max)
				max=users[i].getSalaire();
		}
		return max;
	}
	
	public double getAverageSalary(User [] users) {
		double moy = 0, sum=0;
		for(int i=0; i<users.length; i++)
			sum+=users[i].getSalaire();
		moy = sum/(double) users.length;
		return moy;
	}
	
	public double getMedianSalary(User[] users) {
		int x;
		for(int i=0; i<users.length; i++) {
			for(int j=i+1; j<users.length; j++) {
				if(users[j].getSalaire() < (users[i].getSalaire())){
						x = users[j].getSalaire();
						users[j].setSalaire(users[i].getSalaire());
						users[i].setSalaire(x);
				}
			}
		}
		double median;
		if(users.length%2 == 0)
	        median = (double)(users[(users.length-1)/2].getSalaire() + users[users.length/2].getSalaire())/2;
	    else
	        median = (double) users[users.length/2].getSalaire();
	    
	    return median;
	}
}
