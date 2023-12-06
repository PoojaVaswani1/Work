package Arrays;

import java.util.Scanner;

public class SumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("enter no.s in array ");
		for(int i =0 ; i<n ; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("enter sum ");
		int s = scan.nextInt();
		int count =0;
		for(int j=0;j<n;j++) {
			for(int k=j+1;k<n;k++) {
				if(array[j]+array[k] == s) {
					count++;
				}
			}
		}
		System.out.println(count++);


	}

}
