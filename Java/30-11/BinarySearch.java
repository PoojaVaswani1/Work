package Recurssion;

public class BinarySearch {
	static int i=0;
	static int []a  ;
	static int n=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []b = {1,2,3,4,5,6} ;
		System.out.println(bS(b[], n));

	}
	public static int bS(int []a,int n) {
		int len = a.length;
	 
		if(i>=0&& i<n) {
			if(a[i]==n) {
				return 1;
				
			}
			i++;
	}
		return -1;

}
}
