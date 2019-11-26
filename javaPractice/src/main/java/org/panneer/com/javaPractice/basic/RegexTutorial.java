package org.panneer.com.javaPractice.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTutorial {

	public static void main(String[] args) {
		String st="panneer";
		Pattern pattern = Pattern.compile("\\D{6}");
		Matcher matcher = pattern.matcher("abcdef");
		boolean matches = matcher.matches();
		System.out.println(matches);

	}

}
