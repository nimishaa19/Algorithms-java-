package Algorithm;
import java.time.*;
public class SelectionSort {
	static void swap(int array[],int i,int j) {
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	static void selectionsort(int array[]) {
		int n= array.length;
		for(int i=0;i<n-1;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(array[j]<array[min_index]) {
					swap(array,j,min_index);
					
				}
			}
		}
	}
	
	static void printarray(int array[]) {
		for(int e:array) {
			System.out.print(e+ " ");
		}
	}
	
	
	public static void main(String args[]) {
		
		int a[]= {6,2,43,856,23,4,2,5,7,6788,908};
		selectionsort(a);
		printarray(a);
		
	}

}
