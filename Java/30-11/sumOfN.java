package Recurssion;

public class sumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(6);
		System.out.println(sum(6));

	}
	public static long sum(long n) {
		if (n>0)
			
		return n +sum( n-1);
		return 0;
	}

}
