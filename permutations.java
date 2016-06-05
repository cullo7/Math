import java.util.ArrayList;

public class permutations{

	public static ArrayList<String> permutation(String word){
		ArrayList<String> result = new ArrayList<String>();

		if(word.length() == 0){
			result.add(word);
			return result;
		}

		for(int i = 0; i < word.length(); i++){

			String shorter = word.substring(0,i)+word.substring(i+1);

			ArrayList<String> shorterPermutations = permutation(shorter);

			for(String s: shorterPermutations){
				result.add(word.charAt(i)+s);
			}
		}
		return result;
	}


	public static void main(String args[]){
		for(String s: permutation("beat")){
			System.out.println(s);
		}
	}
}