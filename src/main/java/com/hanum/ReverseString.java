package com.hanum;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Sagar";
		String revStr = "";
		System.out.println("Original word is " + str);
		for (int i = 0; i < str.length(); i++) {
			revStr = str.charAt(i) + revStr;
		}
		System.out.println("reverse string is " + revStr);
	}
}
