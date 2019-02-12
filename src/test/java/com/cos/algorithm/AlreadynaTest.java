package com.cos.algorithm;

import org.junit.Test;

import cos.algorithm.level1.문자열내림차순으로배치하기.Alreadyna;
import junit.framework.Assert;

public class AlreadynaTest {
	
	@Test
	public void test() {
		Assert.assertEquals("gfedcbZ", Alreadyna.solution("Zbcdefg"));
	}
	
	@Test
	public void findKimTest() {
		String[] seoul = {"Jane", "Kim"};
		Assert.assertEquals("김서방은 1에 있다", cos.algorithm.level1.서울에서김서방찾기.Alreadyna.Solution(seoul));
	}
	
	@Test
	public void findMiddleTest() {
		String middle = "abcde";
		Assert.assertEquals("c", cos.algorithm.level1.가운데글자가져오기.Alreadyna.FindMiddle(middle));
	}
	
	@Test 
	public void findSameNoTest() {
		int[] arr = {1, 3, 2, 2, 2, 4, 4};
		Object[] answer = {1, 3, 2, 4};
		
	}

}
