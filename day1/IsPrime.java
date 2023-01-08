package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=67;
		boolean isPrime = false;
		int loopLimit = num/2;
		for(int i = 2;i <= loopLimit; i++)
		{
			if (num % i == 0)
			{
				isPrime = true;
				break;
			}
		}
		if (isPrime)
			System.out.println(num + " is not a prime number");
			else
			System.out.println(num + " is a prime number");
		}
	}
