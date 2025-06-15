package test;

public class Factorial {
	public static int[] fiboArr = new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = factorialCal(6);
		System.out.println("Factorial of 6 is: "+factorial);
		
		System.out.println("Fibonacci Series 10:");
		for(int i=0; i< fiboArr.length;i++) {
			fiboArr[i]=fibonacciSeries(i);
			System.out.print(fiboArr[i]+" ");
		}

	}
	
	public static int factorialCal(int x) {
		if(x !=1) {
			return (x * factorialCal(x-1));
		}else {
			return x;
		}
	}
	
	public static int fibonacciSeries(int x) {
		if(x==0) {
			return 0;
		}else if (x==1) {
			return 1;
		}else {
			return fiboArr[x-1]+fiboArr[x-2];
		}
	}

}
