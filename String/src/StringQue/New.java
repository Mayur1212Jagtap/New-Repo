package StringQue;

public class New {

	public static void main(String[] args) {

		String str = "This is alright";

		String str1 = "";
		String str2 = "";

		for (int i = str.length() - 1; i > 1; i--) {

			str1 = str1 + str.charAt(i);

		}

		for (int j = 0; j <= 1; j++) {

			str2 = str2 + str.charAt(j);

		}

		str1 = str2.concat(str1);

		System.out.println(str1);

	}

}