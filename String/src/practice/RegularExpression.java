package practice;

public class RegularExpression {
	
	public static void main(String[] args) {
		
		String str = "Mayur@#$%^12345";
		
		String str1 = str.replaceAll("[^A-Za-z]", "");
		
		System.out.println(str1);
		

		String str2 = str.replaceAll("[^0-9]", "");
		System.out.println(str2);

		String str3 = str.replaceAll("[^^@#$%]", "");
		System.out.println(str3);

		
//		char[] ch = str.toCharArray();
//		
//		System.out.println(ch.clone());
		
		
	}

}
