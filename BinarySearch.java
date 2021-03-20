package Algorithm;

import java.time.LocalTime;

public class BinarySearch {
	static int binarysearch(int array[],int k,int l,int r) {
		if(r>=1) {
			int mid= l+(r-1)/2;
		
		if(array[mid]==k) {
			return mid+1;
		}
		
		else if(array[mid]<k) {
			return binarysearch(array,k,mid,r);
		}
		else {
			return binarysearch(array,k,l,mid);
		}
		
		
		} 
		return -1;
	}
	
	public static void main(String args[]) {
		System.out.println(System.currentTimeMillis());
		int array[]= {13,53,87,127,138,888,1900};
		System.out.println(binarysearch(array,87,0,array.length+1));
		System.out.println(binarysearch(array,888,0,array.length+1));
		System.out.println(System.currentTimeMillis());
		
	}
	
}
