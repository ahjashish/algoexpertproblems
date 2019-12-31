import java.util.*;

class FindThreeLargestNumbers {
  public static int[] findThreeLargestNumbers(int[] array) {
		int num1 = Integer.MIN_VALUE; 
		int num2 = Integer.MIN_VALUE;;
		int num3 = Integer.MIN_VALUE;
		int[] result = new int[3];
		for(int i=0; i < array.length; i++) {
			if(array[i] >= num3 && array[i] <= num2) {
				num3 = array[i];
			}
			if(array[i] >= num2 && array[i] <= num1) {
				num3 = num2;
				num2 = array[i];
			}
			if(array[i] >= num1) {
				num3 = num2;
				num2 = num1;
				num1 = array[i];
			}
		}
		result[0] = num3;
		result[1] = num2;
		result[2] = num1;
		return result;
  }
}
