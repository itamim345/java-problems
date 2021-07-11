package problems_set_1;

public class SomeOfArrayValues {
	public static void main(String[] args) {
		int[] array = {60, 30, 20, 40, 40, 10};
		int sum = 0;
		//Advanced for loop
		for( int num : array) {
		 sum = sum+num;
		 }
		 System.out.println("Sum of array elements is:"+sum);
	}
}
