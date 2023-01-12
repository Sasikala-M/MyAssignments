package week1.challenge;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A man, a plan, a canal: Panama";
		String lowerStr = str.toLowerCase();
		String noSpecialChars = lowerStr.replaceAll("[^a-zA-Z0-9]", "");
		String revFinalStr = "";
		char[] charRevArray = noSpecialChars.toCharArray();
		for (int i= noSpecialChars.length()-1;i >= 0 ; i--)	
		{
			revFinalStr = revFinalStr + charRevArray[i];
		}
		if (revFinalStr.equals(noSpecialChars))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
				
	}

}
