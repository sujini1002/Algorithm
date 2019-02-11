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

}
