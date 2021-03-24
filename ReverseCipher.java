package edu.mtc.egr281.chapter08;

public class ReverseCipher {

	public static String encode(String plainText) {
		
		StringBuffer sb=new StringBuffer();
		
		for(int i = plainText.length()-1; i>0; --i) {
			System.out.print(plainText.charAt(i));
			sb.append(plainText.charAt(i));
			
			
		}// ending bracket of for loop
		return sb.toString();
	}
	
}
