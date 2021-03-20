package Algorithm;

public class BubbleSort {
	static void swap(int array[],int i,int j) {
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	static void bubblesort(int array[]) {
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(array[j]>array[j+1]) {
					swap(array,j+1,j);
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
		int a[]= {5,3,2,4,6,6664,849,589,995,37,0};
		bubblesort(a);
		printarray(a);
	}


}
