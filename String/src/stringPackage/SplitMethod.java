package stringPackage;

public class SplitMethod {

	public static void main(String[] args) {

		String s1 = "java string split method by javatpoint";
		String[] words = s1.split("a");// splits the string based on whitespace

		for (String w : words) {
			System.out.println(w);
		}
		

	}

}
