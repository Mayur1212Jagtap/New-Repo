package StringQue;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {

		int num = 10;

		long factorialResult = 1L; // Can't use L in front of 0, so 1L is used...

		for (int i = 1; i <= num; i++) {
			factorialResult *= i;
		}
		System.out.println("Factorial: " + factorialResult);

	}

}
