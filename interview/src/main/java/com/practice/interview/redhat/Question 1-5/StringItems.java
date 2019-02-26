/**
 * Question #2
 */
package com.practice.interview.redhat;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Arpit
 * @version 1.0
 * @since 2019-02-15
 */
public class StringItems {

	/**
	 * Question #2 Given there are 50000 items in the input String array, the
	 * function must add all array items to outputString and then return the
	 * outputString. if forceUpperCase is true, the return string must be upper
	 * case.
	 * 
	 * @param items
	 *            - Array of String to.
	 * @param forceUpperCase
	 *            - Boolean value to force to upper case of the before returning
	 *            string.
	 * @return Concated
	 */
	public String addStringItems(String[] items, boolean forceUpperCase) {
		StringBuilder returnValue = new StringBuilder();
		// returnValue="";
		for (int i = 0; i < items.length; i++) {
			returnValue.append(items[i]);
		}
		return forceUpperCase ? returnValue.toString().toUpperCase() : returnValue.toString();
	}

	/**
	 * Question #3 (Not synchronized) - Using Collection
	 * 
	 * Given there are 50000 items in the input String array, the function must
	 * add all array items to outputString and then return the outputString. if
	 * forceUpperCase is true, the return string must be upper case.
	 * 
	 * @param items
	 * @param forceUpperCase
	 */
	public String addStringItemsUsingCollection(String[] items, boolean forceUpperCase) {
		List<String> returnValue = Arrays.asList(items);
		return forceUpperCase ? String.join("", returnValue).toUpperCase() : String.join("", returnValue);
	}

	/**
	 * Question #3 (Synchronized) - Using Collection
	 * 
	 * Given there are 50000 items in the input String array, the function must
	 * add all array items to outputString and then return the outputString. if
	 * forceUpperCase is true, the return string must be upper case.
	 * 
	 * @param items
	 * @param forceUpperCase
	 */
	public String addStringItemsUsingSynchronizedCollection(String[] items, boolean forceUpperCase) {
		List<String> returnValue = Collections.synchronizedList(new LinkedList<String>());
		for (int i = 0; i < items.length; i++) {
			returnValue.add(items[i]);
		}
		// List<String> returnValue = Arrays.asList(items);
		return forceUpperCase ? String.join("", returnValue).toUpperCase() : String.join("", returnValue);
	}

	/**
	 * Main method here is just for test execution.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringItems stringItems = new StringItems();
		String items[] = new String[1000];
		for (int i = 0; i < 1000; i++) {
			items[i] = "s" + i + " ";
		}

		System.out.println(stringItems.addStringItems(items, false));
		System.out.println(stringItems.addStringItems(items, true));
		System.out.println(stringItems.addStringItemsUsingCollection(items, false));
		System.out.println(stringItems.addStringItemsUsingCollection(items, true));
		System.out.println(stringItems.addStringItemsUsingSynchronizedCollection(items, false));
		System.out.println(stringItems.addStringItemsUsingSynchronizedCollection(items, true));
	}

}
