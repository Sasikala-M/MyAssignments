package week1.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray1[] = {1,5,8,33,56,78};
	      int myArray2[] = {66,1,78};
	      System.out.println("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<myArray1.length; i++ ) {
	         for(int j = 0; j<myArray2.length; j++) {
	            if(myArray1[i]==myArray2[j]) {
	               System.out.println(myArray2[j]);
	            }
	         }
	      }
	}

}
