package week1.challenge;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		int sqroot = 0;
		for (int i= 1; i<= x ; i++)
			{
			sqroot = i * i;
			if (sqroot == x)
			{
				System.out.println(i);
				break;
			}
			else
				if (sqroot > x)
				{
					System.out.println(i-1);
					break;
				}	
			}
	}

}
