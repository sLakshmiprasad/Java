package com.slp.ada.sort;

/**
 * Quadratic stable Insert the selected element in the sorted partition of the
 * array
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 3, 1, 12, 55, 99, -11 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
			int newElement = array[firstUnsortedIndex];

			int i;

			for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
				array[i] = array[i - 1];
			}

			array[i] = newElement;

		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + "\t");

		}
	}

}
