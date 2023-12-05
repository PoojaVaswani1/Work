package Arrays;

import java.util.Scanner;

public class MissingNo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("enter no.s in array ");
		for(int i =0 ; i<n ; i++) {
			array[i] = scan.nextInt();
		}
		int expectedSum = ((n+2) * (n+1))/2;
		int actualSum=0;
		for(int j=0; j<n; j++) {
			actualSum += array[j];
		}
		System.out.println("missing no. = " +(expectedSum - actualSum));
		
	}
}
