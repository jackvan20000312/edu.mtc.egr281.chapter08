package edu.mtc.egr281.chapter08;

public class EveryThird {

	public static String decode(String cipherText) {
		StringBuffer sb = new StringBuffer();
		
		for(int i = 1; i < cipherText.length(); i=i+3
				) {
			sb.append(cipherText.charAt(i));
		}//ending bracket of for loop
		return sb.toString();
	}
	
	
}// ending bracket of class
