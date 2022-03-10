package exo3;

public class Palindrome {
	public String s;

	public Palindrome() {
	}

	public boolean palindrome(String str) {
		
		int l = 0;
        int h = str.length()-1;
         
        // LowerCase string
        str = str.toLowerCase();
         
        // Compares character until they are equal
        while(l <= h)
        {
             
            char getAtl = str.charAt(l);
            char getAth = str.charAt(h);
             
            // If there is another symbol in left
            // of sentence
            if (!(getAtl >= 'a' && getAtl <= 'z'))
                l++;
             
            // If there is another symbol in right
            // of sentence
            else if(!(getAth >= 'a' && getAth <= 'z'))
                h--;
             
            // If characters are equal
            else if( getAtl == getAth)
            {
                l++;
                h--;
            }
             
            // If characters are not equal
            else
                return false;
        }
         
        // Returns true
        return true;   
		
	}
}
