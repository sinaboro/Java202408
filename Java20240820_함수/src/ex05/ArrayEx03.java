package ex05;

import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {
		
		int[][] kor = {
						{80,81,82,83,84},
						{90,91,92,93,94},
						{78,79,80,81,82}
					  };
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<kor[i].length; j++)
				System.out.print(kor[i][j] + ", ");
			System.out.println();
		}
			
		
		
	}
}
