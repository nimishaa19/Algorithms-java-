package Algorithm;

public class QuickSort {
	//swap function
	static void swap(int array[],int i,int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	// main quicksort function
	
	static int partition(int a[],int left,int right) {
		int pivot=a[right];
		int low=left-1;
		for(int high=left;high<=right-1;high++) {
			if(a[high]<pivot) {
				low++;
				swap(a,low,high);
				
				
				
			}
			
		}
		swap(a,right,low+1);
		return low+1;
		
		
	}
	
	 //sort
	static void quicksort(int a[],int left,int right) {
		if(left<right) {
			int x= partition(a,left,right);
			quicksort(a,left,x-1);
			quicksort(a,x+1,right);
		}
		
	}
	
	// print array function
	
	static void printarray(int a[]) {
		for(int e:a) {
			System.out.print(e+ " ");
		}
	}
	
	public static void main(String []args) {
		int array[]={6,2,43,856,23,4,2,5,7,6788,908};
		quicksort(array,0,array.length-1);
		printarray(array);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	