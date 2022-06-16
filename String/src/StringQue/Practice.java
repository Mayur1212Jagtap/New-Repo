package StringQue;

public class Practice {

	public static void main(String[] args) {

		int num = 5;

		Long factorialResult = 1L;

		for (int j = 1; j <= num; j++) {

			factorialResult *= j;
		}

		System.out.println("Factorial: " + factorialResult);
	}

}
