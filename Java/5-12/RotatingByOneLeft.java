package Arrays;

import java.util.Scanner;

public class RotatingByOneLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("array size");
		int n = scan.nextInt();
		int [] array = new int[n];
		System.out.println("elements");
		for(int j=0; j<n ;j++) {
			array[j] = scan.nextInt();
		}
		int temp = array[0];
		for(int i=0;i<n-1;i++) {
			array[i] = array[i+1];
		}
		array[n-1]= temp;
		for(int arr : array) {
			System.out.print(arr+ " ");
		}
		

	}

}
