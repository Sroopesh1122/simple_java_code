package com.patterns;

public class Pattern47 {

	public static void main(String[] args) {
		int rows = 9;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i == 1 || i == rows || j == 1 || j == rows || i == j) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

		System.out.println("\n\n\n");

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i == 1 || i == rows || j == 1 || j == rows || i == j || rows + 1 - i == j) {
					System.out.print("*" + " ");

				} else {

					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

		System.out.println("\n\n\n");

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i == 1 || i == rows || j == 1 || j == rows || i == j || rows + 1 - i == j || i == rows / 2 + 1
						|| j == rows / 2 + 1) {
					System.out.print("*" + " ");

				} else {

					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

	}

}

//* * * * * * * * * 
//* *             * 
//*   *           * 
//*     *         * 
//*       *       * 
//*         *     * 
//*           *   * 
//*             * * 
//* * * * * * * * * 
//
//
//* * * * * * * * * 
//* *           * * 
//*   *       *   * 
//*     *   *     * 
//*       *       * 
//*     *   *     * 
//*   *       *   * 
//* *           * * 
//* * * * * * * * * 
//
//
//* * * * * * * * * 
//* *     *     * * 
//*   *   *   *   * 
//*     * * *     * 
//* * * * * * * * * 
//*     * * *     * 
//*   *   *   *   * 
//* *     *     * * 
//* * * * * * * * * 
