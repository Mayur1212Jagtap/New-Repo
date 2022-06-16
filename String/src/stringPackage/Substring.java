package stringPackage;

import java.util.Iterator;

public class Substring {

	public static void main(String[] args) {
//		 the beginIndex starts from 0, whereas the endIndex starts from 1.

		String str = "Welcome Home";

//		for (char c : ch) {
//			System.out.println(c);
//		}
		
		System.out.println(str.subSequence(0, 5));
		System.out.println(str.substring(0, 5));

		String str1 = str.substring(3);
		System.out.println(str1);

		System.out.println(str.substring(6, 9));

		String str2 = str.substring(6, str.length());

		System.out.println(str1);
		System.out.println(str2);

		String s1 = "this is index of example";

		System.out.println(s1.lastIndexOf('e'));

	}

}
