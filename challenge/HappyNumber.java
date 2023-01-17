package week1.challenge;
import java.util.Arrays;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String happyNum = "110";
		char[] happyArray = happyNum.toCharArray();
		int i = happyArray.length;	
		int value= 0;
		int sum = 0;
		int j = 0;
		boolean happyNumFlag = true;
		for ( j = 0; j< i ; j++)
		{
			value = happyArray[j] - '0';
			sum = sum + (value * value);
				if (j == (i-1))
			{
				if (sum >= 10)
				{
					String finalNum = Integer.toString(sum);					
					char[] finalArray = finalNum.toCharArray();
					happyArray = Arrays.copyOf(finalArray, finalArray.length);
					j = -1;	
					i = finalArray.length;
					sum = 0;
					value  = 0;
				}
				else				
				{
					if (sum != 1)
					{
						happyNumFlag = false;
						break;
					}						
				}
			}			
		}   
		if (happyNumFlag)
			System.out.println(happyNum + " is a Happy Number");
		else
			System.out.println(happyNum + " is a not Happy Number");
	}

}
