package Recurssion;

public class PowerFunc {
	static int a;
	int n;
	 static int res =a;

	
	
	public static  int powerFunc(int a, int n) {
		if(n==0)
		return 1;
		
		return a*powerFunc(a, n-1);

}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(powerFunc(3, 2));

}

}
