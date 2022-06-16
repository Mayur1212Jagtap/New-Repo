package practice;

import java.util.HashSet;
import java.util.Set;

public class StringToSet {

	public static void main(String[] args) {

		String str = "Hello everyone";

		Set<Character> set = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			set.add(str.charAt(i));

		}

		System.out.println(set);

		for (Character ch : set) {
			System.out.println(ch);
		}

	}

}
