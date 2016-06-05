public class Palindrome{

	public boolean isPalindrome(int start, int end, String pal){
		if(start > end){
			return true;
		}
		while(!((pal.charAt(start) >= 'a' && pal.charAt(start) <= 'z') || (pal.charAt(start) >= 'A' && pal.charAt(start) <= 'Z'))){
			start++;
		}
		while(!((pal.charAt(end) >= 'a' && pal.charAt(end) <= 'z') || (pal.charAt(end) >= 'A' && pal.charAt(end) <= 'Z'))){
			end--;
		}
		if(pal.charAt(start) == pal.charAt(end)){
			return isPalindrome(start-1, end-1, pal);
		}
		else{
			return false;
		}
		return isPalindrome(start, end, pal);
	}

	public static void main(String args []){
		Palindrome pal = new Palindrome();
		System.out.println(pal.isPalindrome(0, 6, "Hey yeh"));
		System.out.println(pal.isPalindrome(0, 14, "Madam, I'm Adam"));
	}
}