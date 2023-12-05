package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CommonInSortedArrays {

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
		System.out.println("enter array2 size");
		int n2 = scan.nextInt();
		int[] array2 = new int[n2];
		System.out.println("enter no.s in array2 ");
		for(int j =0 ; j <n2 ; j++) {
			array2[j] = scan.nextInt();
		}
		//without using method also we can do the sorting by > ...
		Arrays.sort(array);
		Arrays.sort(array2);
		int count =0;
		int[] array3;
		for(int k=0;k<n;k++) {
			for(int l=0;l<n2;l++) {
				if(array[k] == array2[l]) {
				
				System.out.println(array[k]);
				}
			}
		}
		
	}

}
