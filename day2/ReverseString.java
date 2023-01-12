package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "TestLeaf";
		int j = name.length()-1;
		char[] charArray = name.toCharArray();
		for (int i=0; i<=name.length()-1;i++)
		{		
			System.out.print(charArray[j]);
			j--;
		}
	}

}
