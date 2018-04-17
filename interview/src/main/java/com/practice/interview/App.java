package com.practice.interview;

import com.practice.interview.exception.ReturnFromCatchBlock;
import com.practice.interview.exception.ThrowFromCatchBlock;
import com.practice.interview.outer.inner.Outer;
import com.practice.interview.overloading.OverloadNonPrimitive;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// ExceptionDemo
		System.out.println("------ExceptionReturnDemo -------");
		ReturnFromCatchBlock returnFromCatchBlock = new ReturnFromCatchBlock();
		System.out.println("One or two: " + returnFromCatchBlock.oneOrTwo());
		System.out.println();

		// ExceptionDemo
		System.out.println("------ExceptionDemo -------");
		ThrowFromCatchBlock throwFromCatchBlock = new ThrowFromCatchBlock();
		System.out.println("One or two: " + throwFromCatchBlock.oneOrTwo());
		System.out.println();

		// OverloadingDemo
		System.out.println("------OverloadingDemo -------");
		OverloadNonPrimitive overloadNonPrimitive = new OverloadNonPrimitive();
		String s = "abc";
		Object obj = s;
		overloadNonPrimitive.test(null);
		overloadNonPrimitive.test(s);
		overloadNonPrimitive.test(obj);
		overloadNonPrimitive.test((Object) s);
		System.out.println();

		System.out.println("------OuterInner class Demo -------");
		// OuterInner class Demo
		Outer outer = new Outer();
		outer.outerMethod();
		Outer.Inner inner = outer.new Inner();
		inner.innerMethod();

	}
}
