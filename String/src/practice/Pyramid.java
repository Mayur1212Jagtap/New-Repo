package practice;

public class Pyramid {

	public static void main(String[] args) {

//      1
//     12				int 
//    123
//   1234
//  12345

		int size = 20;

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size - i; j++) {

				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();

		}
	}

}
