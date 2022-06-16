package stringPackage;

public class IndexOfMethod {

	public static void main(String[] args) {

		String s1 = "this is index of example";
		// passing substring
		int index1 = s1.indexOf("is");
		int index2 = s1.indexOf("index");
		System.out.println(index1);
		System.out.println(index2);

		int index3 = s1.indexOf("is", 4);

		System.out.println("a " + s1.indexOf(97, 17));    //parameters(unicode value of a, next to given index)
		System.out.println(index3);

		// passing char value
		int index4 = s1.indexOf('s');
		System.out.println(index4);

		System.out.println(s1.indexOf("of"));

	}

}
