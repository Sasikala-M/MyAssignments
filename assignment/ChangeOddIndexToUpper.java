package week1.assignment;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "testleaf solutions";
		char[] charArray = str.toCharArray();
		String finalStr = "";
		for (int i=0; i<=charArray.length-1;i = i + 2)
		{		
		
			charArray[i] =  Character.toUpperCase(charArray[i]);
		}
		for (int i = 0; i < charArray.length; i++) {
		System.out.print( charArray[i]);
		}
	}

}
