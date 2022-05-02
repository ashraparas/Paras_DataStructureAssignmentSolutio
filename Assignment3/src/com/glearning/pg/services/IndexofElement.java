package com.glearning.pg.services;

public class IndexofElement {
	/* We will use the Linear-search function to find the index of the element */
				public static int indexofElement(int arr[], int t)
				{
					/* let us consider array is null */
					if (arr == null) {
						return -1;
					}

					/* to find the length of an array */
					int len = arr.length;
					int i = 0;

					/* using traverse */
					while (i < len) {
						/* so, if the i'th element is t
						 then return the index */
						if (arr[i] == t) {
							return i;
						}
						else {
							i = i + 1;
						}
					}
					return -1;
				}

}
