public class fibonacciSequence{

	public int Fibonacci(int num){
		if(num < 0) throw new IllegalArgumentException(num + " not valid");
		if(num == 0) return 0;
		if(num == 1) return 1;
		return Fibonacci(num - 2) + Fibonacci(num-1);
	}

	public static void main(String [] args){
		fibonacciSequence fib = new fibonacciSequence();
		System.out.println(fib.Fibonacci(12));
	}
}