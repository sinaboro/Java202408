package ex03;

import java.util.Scanner;

public class ReferaceVar {

	public static void main(String[] args) {
		
		int[] arr1=null;
		int[] arr2;
		int[] arr3;
				
		System.out.println(arr1);
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		
	}

}
