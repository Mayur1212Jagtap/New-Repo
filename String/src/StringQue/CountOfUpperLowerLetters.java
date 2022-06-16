package StringQue;

//String str1 = str + 'm';       // We can concat anything with the string by using +;
//System.out.println(str1);

public class CountOfUpperLowerLetters {

	public static void main(String[] args) {

		String str = "Welcome to AutoMatioN";

		int upper = 0;
		int lower = 0;

		String upperChar = "";
		String lowerChar = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 65 && ch <= 90) {
				upper++;
				upperChar = upperChar + ch;
			}

			if (ch >= 97 && ch <= 122) {
				lower++;
				lowerChar = lowerChar + ch;
			}

		}

		System.out.println("Count of UPPER characters " + upper);
		System.out.println("Count of LOWER characters " + lower);

		System.out.println("Upper characters = " + upperChar);
		System.out.println("Upper characters = " + lowerChar);

	}

}
