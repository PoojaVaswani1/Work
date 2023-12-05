package Arrays;

import java.util.Scanner;

public class SecondLargest {

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
		
		for(int j=0; j<n ; j++) {
			int temp =0;
			for(int k=j+1; k<n; k++) {
				if(array[j]>array[k]) {
				temp = array[j];
				array[j]= array[k];
				array[k] = temp;
				}
			}
		}
		System.out.println(array[n-2]);

	}

}
