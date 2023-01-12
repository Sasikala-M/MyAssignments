package week1.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester in testleaf solutions";
		String[] split = test.split(" ");
	
		for (int i =1 ; i < split.length ; i =  i +2)
		{
			
			String foundString = split[i];
			String revFinalStr = " ";
			char[] charArray = foundString.toCharArray();
			for (int j= charArray.length-1;j >= 0 ; j--)	
			{
				revFinalStr = revFinalStr + charArray[j];
				
			}
			split[i] = revFinalStr;
		}
		
		for (int i =0 ; i < split.length ; i++)
			System.out.print(" " + split[i]);
		}
			
			
	}

