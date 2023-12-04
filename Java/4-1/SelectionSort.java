package Sorting;

import java.util.Scanner;

public class SelectionSort {

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
		selectionSort(array);
		for(int i : array) 
			 System.out.println(i);
		

	}
	
	    public static void selectionSort(int[] arr) {
	        //Your code goes here
	        for(int i=0;i<arr.length;i++){
	            int small =i;
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[small]>arr[j]){
	                    small =j;// finding small no 1st.
	                }
	            }
	            int temp = arr[small];
	            arr[small] = arr[i];
	            arr[i] = temp;
	        }
	    }
	}


