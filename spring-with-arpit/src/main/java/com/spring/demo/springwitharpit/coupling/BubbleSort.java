package com.spring.demo.springwitharpit.coupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortInterface {

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Bubble Sort");
		// Logic to sort
		return arr;
	}

}
