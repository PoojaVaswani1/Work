package Recurssion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));

	}
	public static int factorial(int n) {
		if(n>=1)
		return factorial(n-1)*n;
		return 1;
		
	}

}
