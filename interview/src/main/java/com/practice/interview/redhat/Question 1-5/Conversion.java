/**
 * Question #5
 */
package com.practice.interview.redhat;

/**
 * @author Arpit
 * @version 1.0
 * @since 2019-02-15
 */
public class Conversion {

	/**
	 * Convert a base-10 integer to an 8-bit two's complement binary number, and
	 * return the binary number.
	 * 
	 * @param base10
	 *            - String numeric value in decimal(Should be less than equal to
	 *            511).
	 * @return String - String numeric value in 8 bit binary format of a
	 *         positive number.
	 */
	public String base10to2(String base10) {
		int decimalValue = 0;
		try {
			decimalValue = Integer.parseInt(base10);
		} catch (NumberFormatException nfe) {
			throw new NumberFormatException();
		}
		if (decimalValue > 511 || decimalValue < 0) {
			throw new IllegalArgumentException("Number should be less than or equal to 511");
		}
		int temp = 0;
		String base2 = "";
		int loopTill8Digit = 0;
		while (decimalValue > 0) {
			temp = decimalValue % 2;
			base2 = base2 + "" + temp;
			decimalValue = decimalValue / 2;
		}
		loopTill8Digit = 8 - base2.length();
		StringBuilder input1 = new StringBuilder(base2);
		base2 = input1.reverse().toString();
		for (int i = 0; i < loopTill8Digit; i++) {
			base2 = "0".concat(base2 + "");
		}
		return base2;
	}

	/**
	 * Return 2's complement negative of the given base10 number and return the
	 * binary number.
	 * 
	 * @param base10
	 *            - String numeric value in decimal between -512 to -1.
	 * @return String - String numeric value in 8 bit binary format of a
	 *         negative number.
	 */
	public String negBase2(String base10) {
		int decimalValue = 0;
		try {
			decimalValue = Integer.parseInt(base10);
		} catch (NumberFormatException nfe) {
			throw new NumberFormatException();
		}
		if (decimalValue >= 0) {
			throw new IllegalArgumentException("Number should be negative.");
		}
		int posVal = Math.abs(decimalValue + 1);
		String s = new String(posVal + "");
		String positiveComplement = base10to2(s);
		return twosComplement(positiveComplement.toCharArray());
	}

	/**
	 * Inverse the bit of a array, changes 1 to 0 and 0 to 1.
	 * 
	 * @return String - inverted bits output string
	 */
	private String twosComplement(char[] binary) {
		StringBuilder negativeComplement = new StringBuilder();
		for (int i = 0; i < binary.length; i++) {
			if (binary[i] == 48) {
				negativeComplement.append("1");
			} else {
				negativeComplement.append("0");
			}
		}
		return negativeComplement.toString();
	}

	/**
	 * Main method here is just for test execution.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Conversion conversion = new Conversion();
		System.out.println(conversion.base10to2("-6"));
		System.out.println(conversion.negBase2("-7"));

	}

}
