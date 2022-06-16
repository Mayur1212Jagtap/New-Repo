package stringPackage;

public class New {

	public static void main(String[] args) {

		String name = "what do you know about me";
		System.out.println(name.contains("do you know"));
		System.out.println(name.contains("about"));
		System.out.println(name.contains("About"));
//		System.out.println(name.contains(null));

		// endsWith method>>>>>>>>>>>>>>
		System.out.println(name.endsWith("  me"));
		System.out.println(name.endsWith("About me"));
//		System.out.println(name.endsWith(null));
		System.out.println("Welcome to home".endsWith("e")); // true

		String s1 = "HELLO";
		String s2 = "hello";
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
