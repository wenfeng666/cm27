package com.wenfeng.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RendomUtil
 * @Description: 随机工具类
 * @author: 123
 * @date: 2020年2月27日 上午9:48:03
 */
public class RendomUtil {
	public static int random(int min, int max) {
		Random r=new Random();
		int i=r.nextInt( max -min + 1)+min;
		return i;

	}

	
	
	public static int[] subRandom(int min, int max, int subs) {
		int [] x=new int [subs];
		HashSet<Integer>set=new HashSet<Integer>();
		while(set.size()!=subs) {
			int i=random(min, max);
			set.add(i);
		}
		int k=0;
		for (Integer value : set) {
			x[k]=value;
			k++;
		}
		return x;

	}

	
	
	
	public static char randomCharacter() {
		String str="123456789qwertyuiopASDFGHJKL";
		char c = str.charAt(random(0,str.length()-1));
		return c;

	}

	
	
	
	
	
	
	public static String randomString(int length) {
		String str="";
		for (int i = 0; i <length; i++) {
			str+=randomCharacter();
		}
		
		
		return str;

	}

}
