package week1.day2;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j = 1;
		int[] nums = {2,5,7,7,5,9,2,3,6};
		Arrays.sort(nums);
		for (int k=0;k<nums.length-1;k++)
		{
			if (nums[i] == nums[j])
				
					System.out.println("Duplicate No :" + nums[i]);
			i++;
			j++;
		}
	}

}
