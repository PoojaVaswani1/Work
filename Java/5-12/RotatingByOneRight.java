package Arrays;

import java.util.Scanner;

public class RotatingByOneRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1,2,3,4,5,6]
		Scanner scan = new Scanner(System.in);
		System.out.println("array size");
		int n = scan.nextInt();
		int [] array = new int[n];
		System.out.println("elements");
		for(int j=0; j<n ;j++) {
			array[j] = scan.nextInt();
		}
		int temp= array[n-1];
		
		for(int i=n-2;i>=0;i--) {
			 
			array[i+1]=array[i];
			
		}
		array[0] = temp;
		for(int arr : array) {
			System.out.println(arr);
		}
		
				}

}
