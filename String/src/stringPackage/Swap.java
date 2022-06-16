package stringPackage;

public class Swap {

	public static void main(String[] args) {

//		int i = 100;
//		int j = 150;

//		i = i + j - (j = i);
//				OR
//		j = i + j - (i = j);

//		System.out.println("Value of i = " + i);
//		System.out.println("Value of j = " + j);

		// By using third varia
//		int k = i;    
//		i = j;
//		j = k; 
//		
//		System.out.println("Value of i = " + i);
//		System.out.println("Value of j = " + j);

		String str = "Mayur";
//		
//		for (int i = str.length()-1; i >= 0; i--) {
//			
//			System.out.println(str.charAt(i));
//		}
		
//		
//		
		char[] ch = str.toCharArray();
		
		
		for (int j = ch.length - 1; j >= 0; j--) {
			
			System.out.println(ch[j]);
		}
	}

}
