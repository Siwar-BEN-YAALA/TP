package exo6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User [] users = new User[5];
		users[0] =new User("AA", "aa", 1);
		users[1] =new User("BB", "bb", 2);
		users[2] =new User("CC", "cc", 3);
		users[3] =new User("DD", "dd", 4);
		users[4] =new User("EE", "ee", 5);
		
		UserUtil x = new UserUtil();
		x.raise(users, 2);
		System.out.println("percentage = 2 : "+users[0].getSalaire());
		System.out.println("max : "+x.getMaxSalary(users));
		System.out.println("moyenne : "+x.getAverageSalary(users));
		System.out.println("mediane : "+x.getMedianSalary(users));
	}

}
