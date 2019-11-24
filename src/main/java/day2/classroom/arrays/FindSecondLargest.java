package day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
System.out.println(data.length);
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the last but one and print
		 */
		
		Arrays.sort(data);
		for (int eachdata : data)
	 System.out.println(data[data.length-2]);
		
		

		// Print the second largest number	
		
		
	}

}
