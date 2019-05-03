package com.spring.demo.springwitharpit.coupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements SortInterface {

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Quick Sort");
		return arr;
	}
}
