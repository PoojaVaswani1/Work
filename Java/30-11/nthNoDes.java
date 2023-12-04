package Recurssion;

public class nthNoDes {
	static int count=0 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int [] a = new int[x];
		// TODO Auto-generated method stub
		
		print(a,x);
		for(int i : a) 
		 System.out.println(i);
		

	}
	 public static void print(int a[],int x){
		 if(count>=x) {
			 return;
		 }
		a[count] =x-count;
		count++;
		print(a,x);
	 }

}
