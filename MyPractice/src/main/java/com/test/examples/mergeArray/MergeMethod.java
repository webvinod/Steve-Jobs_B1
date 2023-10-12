package com.test.examples.mergeArray;

public class MergeMethod {

	public void merge() {
		
		int merge[] = {12,22,43,54,85,62,7,38,9,};
//		for(int i:merge)
//		System.out.println(i);
		int temp=merge.length/2;  //we divided the array half and assign that value to temp
		//System.out.println(temp);
		System.out.println("This is the merge2 array:::");
		//In the below for loop we assign the first half of the array to new merge2 array
		for(int i=0;i<temp;i++) {
			int merge2[]= {merge[i]};
			for(int j:merge2) {
				System.out.println(j);
//			if(j<=temp){System.out.print(j+",");}
//			else {System.out.println(j+".");}
			}
		}
		System.out.println("This is the merge3 array:::");
		//In the below for loop we assign the second half of the array to the merge3 array
		for(int l=temp;l<merge.length;l++) {
			int merge3[]= {merge[l]};
			for(int k:merge3) {
				System.out.println(k);
//			if(k<merge.length) {System.out.print(k+",");}
//			else {System.out.print(k+".");}
			}
		}
	}
}
