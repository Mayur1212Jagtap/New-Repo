package stringPackage;

public class OddEven {

	public static void main(String[] args) {

//		String name = "java";
//		System.out.println(name.charAt(4));

		// To print characters at odd and even position using charAt() method...

		String str = "Welcome Home"; 

		for (int i = 0; i < str.length(); i++) {

			if (i % 2 == 1) {

				System.out.println("Char at " + i + " place " + str.charAt(i));

			}
		}

	}

}
