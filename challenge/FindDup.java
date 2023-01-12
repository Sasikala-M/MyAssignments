package week1.challenge;

public class FindDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {4,1,2,1,2,4,5};
		int nonRepNum=nums[0];
		for (int i = 1; i < nums.length; i++) {
			nonRepNum=nonRepNum^nums[i];
			}
		System.out.println(nonRepNum);
	}

}
