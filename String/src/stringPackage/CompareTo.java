package stringPackage;

public class CompareTo {

	public static void main(String[] args) {

		// CompareTo method compares two strings by using unicode (ASCII) value...

		String s1 = "Ronaldo";
		String s2 = "Messi";
		System.out.println(s1.compareTo(s2)); // R = 82 & M = 77-----SO, 82-77 = 5

		String s3 = "Major";
		String s4 = "Messi";
		System.out.println(s3.compareTo(s4)); // a = 97 & e = 101-----SO, 97 - 101 = -4

		String s5 = "Ronaldo";
		String s6 = "Ronaldo";
		System.out.println(s5.compareTo(s6)); // If two strings are same.. then it returns 0.

		String s7 = "Ronaldo";
		String s8 = "RONALDO";
		System.out.println(s7.compareTo(s8)); // o = 111 & O = 79-----SO, 111-79 = 32

		String s9 = "Ronaldo";
		String s10 = "";
		System.out.println(s9.compareTo(s10)); // It will return length of first String i.e. s9.length()...

		String s11 = "";
		String s12 = "Ronaldo";
		System.out.println(s11.compareTo(s12));

//		@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		// compareToIgnoreCase >>>>>>>>>>>>
		
		String s13 = "Ronaldo";
		String s14 = "RONALDO";
		System.out.println(s13.compareToIgnoreCase(s14));
		
//		@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	}

}
