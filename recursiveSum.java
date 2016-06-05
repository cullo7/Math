import java.util.Scanner;

public class recursiveSum{

	public int sum(int [] a, int index){
		if(index == a.length-1){
			return a[a.length-1];
		}
		return a[index]+sum(a, index+1);
	}


	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int [] a = new int[10];
		recursiveSum s = new recursiveSum();
		//System.out.println(s.sum(a, 0));
		System.out.println("Enter a few numbers:");
		int i = 0;
		int input = 0;
		while(true){
			input = in.nextInt();
			if(input < 0){
				break;
			}
			a[i] = input;
			i++;
		}
		System.out.println(s.sum(a,0));

	}
}