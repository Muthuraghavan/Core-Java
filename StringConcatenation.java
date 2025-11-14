package com.java.StringPrograms;

public class StringConcatenation {

	public static void main(String[] args) {
		StringBuilder stbu = new StringBuilder();
		System.out.println(stbu.capacity());
		String str = "Muthuraghavan";
		System.out.println(str);
		String str1 = new String("Muthukumari");
		System.out.println(str1);
		str1+= "Velmurugan";
		System.out.println(str1);

	}

}
