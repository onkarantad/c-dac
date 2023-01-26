package data_structure.ds_linear_binary_search;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println("size : " + arr.length);
		Searching.display(arr);
		System.out.println("enter key : ");
		int key = in.nextInt();
		
		if(Searching.linearSearch(arr, key)) {
			System.out.println("key : " + key);
			System.out.println("comparison : " + Searching.lComparison);
		}
		else {
			System.out.println("key is not found");
			System.out.println("comparison : " + Searching.lComparison);
		}
		
		System.out.println("========================================");
		
		if(Searching.binarySearch(arr, key)) {
			System.out.println("key : " + key);
			System.out.println("comparison : " + Searching.bComparison);
		}
		else {
			System.out.println("key is not found");
			System.out.println("comparison : " + Searching.bComparison);
		}
		
		
		in.close();
	}

}
