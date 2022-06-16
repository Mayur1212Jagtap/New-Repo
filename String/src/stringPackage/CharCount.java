package stringPackage;

public class CharCount {

	public static void main(String[] args) {

//		Counting Frequency of a character in a String by Using the charAt() Method
		String str = "Welcome! Welcome!! Welcome!!!";

		int countW = 0;
		int countE = 0;
		int countL = 0;
		int countC = 0;
		int countO = 0;
		int countM = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == 'W') {
				countW++;
			}
			if (ch == 'e') {
				countE++;
			}
			if (ch == 'l') {
				countL++;
			}
			if (ch == 'c') {
				countC++;
			}
			if (ch == 'o') {
				countO++;
			}
			if (ch == 'm') {
				countM++;
			}
		}

		System.out.println("Count of character W " + countW);
		System.out.println("Count of character e " + countE);
		System.out.println("Count of character l " + countL);
		System.out.println("Count of character c " + countC);
		System.out.println("Count of character o " + countO);
		System.out.println("Count of character m " + countM);

	}

}
