package Recurssion;

public class nthNo {
	static int count =0;
	public static void main(String[] args) {
		
		int n=5;
		int [] a = new int[n];
		// TODO Auto-generated method stub
		
		print(a,n);
		for(int i : a) 
		 System.out.println(i);
	}
	public static  void print(int a[],int n){
        if(count == n){
            return;
        }
        a[count]= count + 1;
        count++;
        print(a,n);
    }
}
