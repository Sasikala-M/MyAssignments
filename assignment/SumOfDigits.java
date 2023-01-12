package week1.assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Tes12Le79af65";
		int sum = 0;

		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isDigit(charArray[i])) {

				int value = Character.getNumericValue(charArray[i]);

				sum= sum + value;

			}
		}

		System.out.println("Sum : " +sum);

	}

}
