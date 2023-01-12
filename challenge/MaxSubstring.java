package week1.challenge;

public class MaxSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   fly me   to   the moon  ";
		String trimString = str.trim();
		String[] split = trimString.split(" ");
		System.out.println(split[split.length-1].length());
	}
}
