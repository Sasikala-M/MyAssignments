package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		System.out.print(sum);
		for(sum = 0; sum<145;)
		{
			System.out.print(" " + secondNum);
			sum = firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;	
		}
		}
	}
