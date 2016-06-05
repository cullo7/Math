public class fibonacciSequence{

	public int Fibonacci(int num){
		if(num < 0) throw new IllegalArgumentException(num + " not valid");
		if(num == 0) return 0;
		if(num == 1) return 1;
		return Fibonacci(num - 2) + Fibonacci(num-1);
	}

	public int fibonacciHelper(int num){
		long time1 = System.currentTimeMillis();
		int result = Fibonacci(num);
		long time2 = System.currentTimeMillis();
		System.out.println(result);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(num + "-> Time taken " + (time2 - time1) + " milliseconds");
		return 0;
	}

	public static void main(String [] args){
		fibonacciSequence fib = new fibonacciSequence();
		System.out.println("Fibonacci - 0: ");
		fib.fibonacciHelper(0);
		System.out.println("Fibonacci - 1: ");
		fib.fibonacciHelper(1);
		System.out.println("Fibonacci - 2: ");
		fib.fibonacciHelper(2);
		System.out.println("Fibonacci - 3: ");
		fib.fibonacciHelper(3);
		System.out.println("Fibonacci - 4: ");
		fib.fibonacciHelper(30);
	}
}