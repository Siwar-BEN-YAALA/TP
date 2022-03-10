package exo4;

public class Anagramme {
	public String str1;
	public String str2;
	
	public Anagramme() {
	}
	
	public boolean isAnagramme(String A,String B) {
		
		if(A.length() != B.length())
	        return false;

	   A = A.toLowerCase();
	   B = B.toLowerCase();

	   for(int i = 0; i < A.length(); i++){
	       boolean found = false;
	       for(int j = 0; j < B.length(); j++){
	           if(A.charAt(i) == B.charAt(j)){
	               found = true;
	               break;
	           }
	       }
	       if(!found){
	           return false;
	       }
	   }

	   for(int i = 0; i < B.length(); i++){
	       boolean found = false;
	       for(int j = 0; j < A.length(); j++){
	           if(A.charAt(j) == B.charAt(i)){
	               found = true;
	               break;
	           }
	       }
	       if(!found){
	           return false;
	       }
	   }

	   int sum1 = 0, sum2 = 0;
	   for(int i = 0; i < A.length(); i++){
	       sum1 += (int)A.charAt(i);
	       sum2 += (int)B.charAt(i);               
	   }

	   if(sum1 == sum2){
	       return true;
	   } 
	   return false;
		
	}
}
