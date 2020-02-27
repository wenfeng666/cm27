package com.wenfeng.common.utils;





import org.junit.Test;

public class RendomUtilTest {

	@Test
	public void testRandom() {
		int i = RendomUtil.random(1, 120);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int [] is=RendomUtil.subRandom(1, 10, 3);
		for (int i : is) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RendomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String string = RendomUtil.randomString(4);
		System.out.println(string);
	}

}
