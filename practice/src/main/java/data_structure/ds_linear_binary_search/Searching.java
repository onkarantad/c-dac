package data_structure.ds_linear_binary_search;

public class Searching {
	
	public static int lComparison=0;
	public static int bComparison=0;
	

	public static boolean linearSearch(int[] arr,int key) {
		System.out.println("in linear search");

		for(int i=0 ; i<arr.length ; i++) {
			lComparison ++;	
			if(key == arr[i])
				return true;
		}
		return false;	
	}
	
	public static boolean binarySearch(int[] arr,int key) {
		System.out.println("in binary search");
		
		int left=0;
		int right=arr.length-1;
		
		while(left <= right) {
			bComparison ++;	
			
			int mid=(left+right)/2;
			
			if(key == arr[mid])
				return true;
			
			if(key < arr[mid])
				right = mid-1;
			
			else
				left = mid+1;	
		}
		return false;
	}
	
	
	
	
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}
