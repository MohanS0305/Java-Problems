package com.java.problems;

import java.util.Arrays;

public class Problem_56 {

	public static void main(String[] args) {
		/*
		 * Last night you partied a little too hard. Now there's a black and white photo
		 * of you that's about to go viral! You can't let this ruin your reputation, so
		 * you want to apply the box blur algorithm to the photo to hide its content.
		 * 
		 * The pixels in the input image are represented as integers. The algorithm
		 * distorts the input image in the following way: Every pixel x in the output
		 * image has a value equal to the average value of the pixel values from the 3 ×
		 * 3 square that has its center at x, including x itself. All the pixels on the
		 * border of x are then removed.
		 * 
		 * Return the blurred image as an integer, with the fractions rounded down.
		 * 
		 * Example
		 * 
		 * For
		 * 
		 * image = [[1, 1, 1], [1, 7, 1], [1, 1, 1]] the output should be
		 * solution(image) = [[1]].
		 * 
		 * To get the value of the middle pixel in the input 3 × 3 square: (1 + 1 + 1 +
		 * 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1. The border pixels are cropped
		 * from the final result.
		 * 
		 * For
		 * 
		 * image = [[7, 4, 0, 1], [5, 6, 2, 2], [6, 10, 7, 8], [1, 4, 2, 0]] the output
		 * should be
		 * 
		 * solution(image) = [[5, 4], [4, 4]] There are four 3 × 3 squares in the input
		 * image, so there should be four integers in the blurred output. To get the
		 * first value: (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5. The
		 * other three integers are obtained the same way, then the surrounding integers
		 * are cropped from the final result.
		 */
		int[][] image = { { 1, 1, 1 }, { 1, 7, 1 }, { 1, 1, 1 } };
		System.out.println(Arrays.deepToString(solution(image)));
	}
	
	private static int[][] solution(int[][] image) {
		// get the row length
		int rowLen = image.length;
		// get the column length
		int colLen = image[0].length;
		// create new 2d array to store the final result
		int[][] finalResult = new int[rowLen - 2][colLen - 2]; // (rowLen and colLen -2 because we remove the left and
																// right of the matrix)
		for (int row = 1; row < rowLen - 1; row++) {
			for (int col = 1; col < colLen - 1; col++) {
				finalResult[row - 1][col - 1] = getAvg(image, row, col); // find the average number and get back the average no
			}
		}

		return finalResult;
	}

	private static int getAvg(int[][] img, int r, int c) {
		// upperLeft -1, -1
		// upperMid -1, 0
		// upperRight -1, +1
		// midLeft 0, -1
		// midMid 0, 0
		// midRight 0, +1
		// downLeft +1, -1
		// downMid +1, 0
		// downRight +1, +1
		return (img[r - 1][c - 1] + img[r - 1][c] + img[r - 1][c + 1] +
				img[r][c - 1] + img[r][c] + img[r][c + 1] +
				img[r + 1][c - 1] + img[r + 1][c] + img[r + 1][c + 1]
				)/9;
	}
}
