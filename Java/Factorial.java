public class Factorial{

	public int Fact(int num){
		if(num < 0) throw new IllegalArgumentException(num + " not valid");
		if(num == 0) return 0;
		if(num == 1) return 1;
		return num*Fact(num-1);
	}

	public static void main(String [] args){
		Factorial factorial = new Factorial();
		System.out.println("Factorial - 0: ");
		System.out.println(factorial.Fact(0));
		System.out.println("Factorial - 1: ");
		System.out.println(factorial.Fact(1));
		System.out.println("Factorial - 2: ");
		System.out.println(factorial.Fact(2));	
		System.out.println("Factorial - 3: ");
		System.out.println(factorial.Fact(3));
		System.out.println("Factorial - 10: ");
		System.out.println(factorial.Fact(1x0));
	}
}