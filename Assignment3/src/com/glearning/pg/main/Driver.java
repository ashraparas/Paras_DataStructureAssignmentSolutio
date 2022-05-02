package com.glearning.pg.main;

import java.util.Scanner;
import com.glearning.pg.services.IndexofElement;
import com.glearning.pg.services.PreviousElementChk;

@SuppressWarnings("unused")/* Suppress warnings */
public class Driver {
	
	static int N;
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		PreviousElementChk	prevElem = new PreviousElementChk();
		IndexofElement IdxofElem = new IndexofElement();
		
		System.out.println ("Enter the Total number of floors in the building");
		N = sc.nextInt();
		
		
		/* Test cases
		 * int arr [] = {1,2,3,8,9,10,4,5,7,6};
		 * int arr [] = {3,1,2};
		 * int arr [] = {4,5,1,2,3};
		 */
		
		
		int[] arr = new int[N];
		int day, curr_idx=0;

		for(int i=0; i<N; i++) {
			System.out.println("Enter the floor size given on day: "+(i+1));
			arr[i] = sc.nextInt();
		}

		sc.close();

		System.out.println("The order of the construction is as below");

		for(day=0; day<arr.length; day++) {

			if(arr[day] != N) {
				System.out.println("Day "+(day+1));
				System.out.println("x");
			}

			else if (arr[day] == N) {
				System.out.println("Day "+(day+1));
				System.out.print(arr[day]);
				System.out.print(" ");
				curr_idx = IndexofElement.indexofElement(arr, N);
				N--;
				if(curr_idx != 0)
					N = PreviousElementChk.previousElementChk(arr, curr_idx, N);
				System.out.println("");
			}

		} /* End of loop */

	}

}
