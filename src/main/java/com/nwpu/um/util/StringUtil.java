package com.nwpu.um.util;

public class StringUtil {
	/*
	 * 判断字符串是否为空
	 */
	public static boolean isEmpty(String str) {
		if (str != null) {
			str = str.trim();
		}
		
		return "".equals(str);
	}

	/*
	 * 判断字符串是否非空
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
}
