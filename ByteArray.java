package com.java.StringPrograms;

import java.util.Arrays;

public class ByteArray {

	public static void main(String[] args) {
		String str = "Muthuraghavan";
		byte[] byteArray = str.getBytes();
		System.out.println("String to byte array:" +Arrays.toString(byteArray));

	}

}
