package com.java.StringPrograms;

public class StringtoStringBuffer {

	public static void main(String[] args) {
		String str[] = {"Muthu", "Commander", "Stark"};
		StringBuilder sb = new StringBuilder();
		sb.append(str[0]);
		sb.append(" "+str[1]);
		sb.append(" "+str[2]);
		System.out.println(sb.toString());
	}

}
