package Algorithm;

import java.util.Arrays;

public class InsertionSort {
	static void insertionsort(int array[],int n) {
		
		if(n<=1) {
			return;
		}
		insertionsort(array,n-1);
		int last= array[n-1];
		int j=n-2;
		while(j>=0 && array[j]>last) {
			array[j+1]=array[j];
			j--;
			
			
		}
		array[j+1]=last;
		
	}
	 
	public static void main(String args[]) {
		int a[]= {5,3,2,4,6,6664,849,589,995,37,0};
		insertionsort(a,a.length);
		System.out.println(Arrays.toString(a));
		}
	
	
	

}
