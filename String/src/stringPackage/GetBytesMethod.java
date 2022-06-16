package stringPackage;

import java.util.Arrays;

public class GetBytesMethod {

	public static void main(String[] args) {

		String s1 = "ABCDEFG";
		
		byte[] by = s1.getBytes();     // We get ASCII values of given string 
		
		for (int i = 0; i < by.length; i++) {
			System.out.println(by[i]);
		}
		
		  // Getting string back   
        String s2 = new String(by);   // In this way, only byte array can be converted into the string...
        System.out.println(s2);  
        
        
//        int[] i = {2,3,4,5,6};
//        
//        String st = Arrays.toString(i);
//        
//        System.out.println(st);

	}

}
