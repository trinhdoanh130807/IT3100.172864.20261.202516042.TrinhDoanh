import java.util.Arrays;
public class SortCostArray {
	public static void main(String args[]) {
		int costArray[] = { 1789, 2035, 1899, 1456, 2013 };
		int sum = 0;
		for(int i=0; i < costArray.length; i++) {
			sum += costArray[i];
		}
		for (int i = 0; i < costArray.length - 1; i++) {
			for( int j = i + 1; j < costArray.length; j++ ) {
				if( costArray[i] > costArray[j] ) {
					int tem = costArray[i];
					costArray[i] = costArray[j];
					costArray[j] = tem;
				}
			}
		}
		double average = (double) sum/costArray.length;
		String array = Arrays.toString(costArray);
		System.out.println("Sorted array: " + array );
		System.out.println("Summary: " + sum);
		System.out.println("Average: " + average);
	}
	
}
