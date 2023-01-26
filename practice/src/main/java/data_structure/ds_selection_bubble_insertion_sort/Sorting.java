package data_structure.ds_selection_bubble_insertion_sort;

public class Sorting {
	static int iteration = 0;
	static int comparison = 0;
	static int selPos;
	static int pos;
	static int it;
	static boolean flag=true;

	public static void selectionSort(int[] arr) {
		System.out.println("in selection sort");
		for (selPos = 0; selPos < arr.length - 1 && flag == true; selPos++) {
			flag=false;
			iteration++;
			for (pos = selPos + 1; pos < arr.length; pos++) {
				comparison++;
				if (arr[pos] < arr[selPos]) {
					flag = true;
					swap(arr, pos, selPos);
//					 int t = arr[selPos]; arr[selPos] = arr[pos]; arr[pos] = t;	 
				}
			}
		}
		System.out.println("iteration : " + iteration);
		System.out.println("comparison : " + comparison);
	}

	
	
	
	
	public static void bubbleSort(int[] arr) {
		System.out.println("in bubble sort ");
		for (it = 0; it < arr.length && flag == true; it++) {
			flag=false;
			iteration++;
			for (pos = 0; pos < arr.length - it - 1; pos++) {
				comparison++;
				if (arr[pos + 1] < arr[pos]) {
					flag = true;
					swap(arr, pos, pos + 1);
				}
			}
		}
		System.out.println("iteration : " + iteration);
		System.out.println("comparison : " + comparison);
	}


	
	public static void insertionSort(int[] arr) {
		System.out.println("in insertion sort sort ");
		for(int i=1 ; i<arr.length ; i++) {
			int key=arr[i];
			int j=i-1;
			iteration++;
			
		while(j >=0 && arr[j] > key) {
			arr[j+1]=arr[j];
			comparison++;
			j--;
		}
		arr[j+1]=key;
		}
		System.out.println("iteration : " + iteration);
		System.out.println("comparison : " + comparison);	
	}
	
	
	
	
	
	
	
	
	
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	public static void swap(int[] arr, int a, int b) {
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}

}
