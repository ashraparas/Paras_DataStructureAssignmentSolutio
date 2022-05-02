package com.glearning.pg.services;

public class PreviousElementChk {
	public static int previousElementChk(int arr[], int curr_idx, int N) {

		int temp_idx = curr_idx;

		for(int j=0; j<temp_idx; j++) {
			if(arr[j] == N) {
				System.out.print(arr[j]);
				System.out.print(" ");
				break;
			}
			
			if((arr[j] != N) && (j == (temp_idx-1)))
					return N;

		} /* End loop */
		N--;
		N = previousElementChk(arr, temp_idx, N);
		
		return N;
	}

}
