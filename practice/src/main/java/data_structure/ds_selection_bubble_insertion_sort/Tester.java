package data_structure.ds_selection_bubble_insertion_sort;

public class Tester {

	public static void main(String[] args) {
		
		int[] arr = new int[] {6,4,2,3};
		System.out.println("size : " + arr.length);
		Sorting.display(arr);
//		Sorting.selectionSort(arr);  //itr=6 , comp=21
//		Sorting.bubbleSort(arr);
		Sorting.insertionSort(arr);
		Sorting.display(arr);

	}
	
	

}
