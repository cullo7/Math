import java.util.Arrays;

public class primeNumbers{
	public static void main(String args[]){
		int [] primes = new int [5];
		int counter = 2;
		int primesIndex = 0;
		boolean prime;
		while (primesIndex < 5){
			prime = true;
			for(int i = counter-1; i > 1; i--){
				if (counter%i == 0){
					prime = false;
				}
			}
			if(prime){
				primes[primesIndex] = counter;
				primesIndex++;
			}
			counter++;
		}
		System.out.println(Arrays.toString(primes));
	}
}