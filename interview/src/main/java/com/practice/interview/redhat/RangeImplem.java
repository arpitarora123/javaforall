/**
 * Question #1
 */
package com.practice.interview.redhat;

import java.util.ArrayList;
import java.util.List;

/**
 * The RangeImplem class implements Range interface and provide implementation
 * of the methods to modify, get min/max range.
 * 
 * @author Arpit
 * @version 1.0
 * @since 2019-02-15
 */
public class RangeImplem implements Range {

	private List<Integer> rangeList;

	/**
	 * Default no argument constructor.
	 */
	public RangeImplem() {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Range newRange(int from, int to) {
		RangeImplem range = new RangeImplem();
		range.rangeList = new ArrayList<Integer>();
		if (from > to) {
			throw new IllegalArgumentException("Range is invalid");
		}
		if (from <= to) {
			range.rangeList.add(from);
			range.rangeList.add(to);
		}
		return range;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isIn(int value) {
		boolean isIn = false;
		for (int i = 0; i < this.rangeList.size(); i += 2) {
			isIn = value >= this.rangeList.get(i) && value <= this.rangeList.get(i + 1);
			if (isIn) {
				break;
			}
		}
		return isIn;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int min() {
		if (null == this.rangeList || 1 > this.rangeList.size()) {
			throw new IllegalArgumentException("Range is invalid");
		}
		return this.rangeList.get(0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int max() {
		if (null == this.rangeList || 1 > this.rangeList.size()) {
			throw new IllegalArgumentException("Range is invalid");
		}
		return this.rangeList.get(this.rangeList.size() - 1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Range add(Range r) {
		RangeImplem rangeToAdd = (RangeImplem) r;
		if (null == this.rangeList || null == rangeToAdd.rangeList) {
			throw new IllegalArgumentException("Range is invalid");
		}
		int fromRange = this.min();
		int toRange = this.max();

		int fromRangeToAdd = rangeToAdd.min();
		int toRangeToAdd = rangeToAdd.max();
		if (fromRangeToAdd < fromRange) {
			// Range1 [5, 15]
			// Range2 [3, 10]
			this.rangeList.clear();
			this.rangeList.add(fromRangeToAdd);
			if (fromRange > toRangeToAdd) {
				this.rangeList.add(toRangeToAdd);
				this.rangeList.add(fromRange);
				this.rangeList.add(toRange);
			} else {
				this.rangeList.add(toRangeToAdd > toRange ? toRangeToAdd : toRange);
			}
		} else if (fromRangeToAdd > fromRange) {
			// Range1 [3, 10]
			// Range2 [12, 15]
			this.rangeList.clear();
			this.rangeList.add(fromRange);
			if (fromRangeToAdd > toRange) {
				this.rangeList.add(toRange);
				this.rangeList.add(fromRangeToAdd);
				this.rangeList.add(toRangeToAdd);
			} else {
				this.rangeList.add(toRangeToAdd > toRange ? toRangeToAdd : toRange);
			}
		} else {
			// When fromRange and fromRangeToAdd are Equal
			// Range1 [5, 10]
			// Range2 [5, 15]
			this.rangeList.remove(1);
			this.rangeList.add(toRangeToAdd > toRange ? toRangeToAdd : toRange);
		}
		return this;
	}

	/**
	 * Main method here is just for test execution.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		RangeImplem r = new RangeImplem();

		System.out.println(r.newRange(1, 5).isIn(3)); // true
		System.out.println(r.newRange(1, 5).isIn(6)); // false
		System.out.println(r.newRange(1, 5).add(r.newRange(8, 10)).isIn(6)); // false
		r = (RangeImplem) r.newRange(5, 15).add(r.newRange(3, 10));
		System.out.println(r.min());
		System.out.println(r.max());

		r = (RangeImplem) r.newRange(3, 10).add(r.newRange(12, 15));
		System.out.println(r.min());
		System.out.println(r.max());

		r = (RangeImplem) r.newRange(5, 10).add(r.newRange(5, 15));
		System.out.println(r.min());
		System.out.println(r.max());
	}

}
