package practice;

public class MydemoString {
	public static void main(String[] args) {
		String str = "Hello World";
		int str1 = str.length();
		 System.out.println(str1);
		
		 char ch = str.charAt(4);
		 System.out.println(ch);
		 
	//printing single single character in string	 
		 int size = str1;
		char[] ch1 = new char[size ];
		 for(int i = 0; i < size ; i++) {
			 ch1[i] = str.charAt(i);
			 System.out.println(ch1[i]);
		 }
		 //trim
		 String s = "  Hello World  ";
		 String s1 = s.trim();
         System.out.println(s1);
         
        // starts with  ends with
       boolean s2 = s1.startsWith("He");
     //  boolean s2 = s1.endsWith("He");
       System.out.println(s2);
       
	}

}
