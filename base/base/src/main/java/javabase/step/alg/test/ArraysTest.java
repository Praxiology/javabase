package javabase.step.alg.test;

import java.util.Arrays;

import org.junit.Test;

import javabase.step.util.ArrrysUtil;

public class ArraysTest {
	
	@Test
	public void arraysTest() {
		int[] or = ArrrysUtil.randomArrys(100);
		System.out.printf("or:%s",Arrays.toString(or));
	}

}
