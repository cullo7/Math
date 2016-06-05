public class ContinuousSum{
	public static int max(int [] array){
		int max = 0;
		int count = 0;
		for(int i = 0; i < array.length; i++){
			count = count + array[i] > array[i] ? count + array[i] : array[i];
			max = max > count ? max : count;
		}
		return max;
	}
	public static void main(String [] args){
		int [] array = {1, -2, 5, 3, 4, -2, 3};
		System.out.println(max(array));
	}
}