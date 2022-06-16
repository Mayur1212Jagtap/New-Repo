package StringQue;

public class MIssingNumberOfArray {

	public static void main(String[] args) {

		int i[] = { 1, 2, 3, 5, 6, 7};  // 4 is missing

		int n = i.length + 1;

		int sumOfnNumbers = n * (n + 1) / 2;

		int sumOfGivenArray = 0;

		for (int j = 0; j < i.length; j++) {

			sumOfGivenArray += i[j];

		}

		System.out.println(sumOfnNumbers - sumOfGivenArray);

	}

}
