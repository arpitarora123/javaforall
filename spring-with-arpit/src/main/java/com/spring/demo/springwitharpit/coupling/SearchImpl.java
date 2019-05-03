package com.spring.demo.springwitharpit.coupling;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SearchImpl {

	@Autowired
	@Qualifier("quick")
	SortInterface sort;

	// SearchImpl(SortInterface sort) {
	// System.out.println("Consturctor Injection.");
	// this.sort = sort;
	// }
	// QuickSort
	// HeapSort

	// Interface -> sort()

	public int search(int[] arr, int element) {
		// SortArrayImpl
		// Logic for searching the element
		int sortedArray[] = sort.sort(arr);

		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Post construct.");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre Destruction.");
	}

	public void setSort(SortInterface sort) {
		this.sort = sort;
	}

	public SortInterface getSort() {
		return sort;
	}

}

// Bubble Sort
// Quick Sort
// Heap Sort
// Sorting