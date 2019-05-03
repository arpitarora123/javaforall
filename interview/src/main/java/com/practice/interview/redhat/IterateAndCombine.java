/**
 * Question #4
 */
package com.practice.interview.redhat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Arpit
 * @version 1.0
 * @since 2019-02-15
 */
public class IterateAndCombine {

	/**
	 * itr1 and itr2 iterate over their contents in sorted order
	 * 
	 * The result is the combination of itr1 and itr2, in the same order itr1
	 * and itr2 is sorted.
	 * 
	 * @param itr1
	 *            - Iterator<String>
	 * @param itr2
	 *            - Iterator<String>
	 * @return List<String> - Combined sorted list of both the iterators
	 */
	public List<String> combine(Iterator<String> itr1, Iterator<String> itr2) {
		final List<String> merged = new ArrayList<String>();
		// String value1 = "";
		String value1 = itr1.hasNext() ? itr1.next() : null;
		String value2 = itr2.hasNext() ? itr2.next() : null;

		while (value1 != null || value2 != null) {

			if (value2 == null || (value1 != null && value1.compareTo(value2) <= 0)) {

				// Add list1 value to result and fetch next value, if available
				merged.add(value1);
				value1 = (itr1.hasNext() ? itr1.next() : null);

			} else {

				// Add list2 value to result and fetch next value, if available
				merged.add(value2);
				value2 = (itr2.hasNext() ? itr2.next() : null);

			}
		}
		return merged;
	}

	/**
	 * Main method here is just for test execution.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> demoList1 = new ArrayList<String>();
		demoList1.add("arora");
		demoList1.add("arpit");
		List<String> demoList2 = new ArrayList<String>();
		demoList2.add("abc");
		demoList2.add("efg");
		demoList2.add("ijk");
		demoList2.add("xyz");
		Iterator<String> itr1 = demoList1.iterator();
		Iterator<String> itr2 = demoList2.iterator();

		IterateAndCombine iterateAndCombime = new IterateAndCombine();
		System.out.println(iterateAndCombime.combine(itr1, itr2).toString());

	}

}
