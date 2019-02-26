package com.practice.interview;

//RED HAT INTERVIEW
// 2D (n * m) Array with 0 & 1,
// 0, 0, 0, 0, 0
// 0, 0, 0, 0, 0
// 0, 0, 0, 0, 0 
// 0, 0, 0, 0, 0
// 0, 0, 0, 1, 1
// 0, 0, 0, 1, 1-> 0 -> 1 's
// 0, 0, 1, 1, 1   ... x -> 1's
// 0, 1, 1, 1, 1  .... y -> 1's
// 1, 1, 1, 1, 1	...z -> 1's

// n -> Rows
// m -> Cols

// worst case  n*m
// best case   n
public class DemoArray {

	int calculateOnein2DArray(int arr[][], int n, int m) {
		int numberOfOnce = 0;
		int breakIndex = m;
		int remainingRows = 0;
		for (int row = 0; row < n; row++) {
			remainingRows = 0;
			for (int col = breakIndex; col > 0; col--) {
				// if (0 == arr[row][m]) {
				// break;
				// }
				if (0 == arr[row][col]) {
					breakIndex = col;
					remainingRows = n - row;
					if (remainingRows > 0) {
						numberOfOnce = remainingRows * (m - breakIndex);
					}
					break;
				}
				if (1 == arr[row][col]) {
					numberOfOnce++;

				}
			}
		}
		return numberOfOnce;
	}

	public static void main(String[] args) {

	}

}
