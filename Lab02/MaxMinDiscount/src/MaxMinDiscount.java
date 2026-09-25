
public class MaxMinDiscount {
	public static void main (String args[]) {
		String[] title = { "Lion King", "Star Wars", "Aladin", "Frozen", "Coco" };
		double[] cost = { 19.95, 24.95, 18.99, 27.50, 15.00 };
		int maxIndex = 0, minIndex = 0;
		double total  = 0; 
		for( int i=0; i < cost.length; i++) {
			if( cost[i] > cost[maxIndex] ) {
				maxIndex = i;
			}
			if( cost[i] < cost[minIndex] ) {
				minIndex = i;
			}
			double finalCost = (cost[i] > 20) ? cost[i] * 0.9 : cost[i];
			total += finalCost;
		}
		System.out.println("Max: " + title[maxIndex] + " - " + cost[maxIndex]);
		System.out.println("Min: " + title[minIndex] + " - " + cost[minIndex]);
		System.out.println("Total after discount: " + total);
	}
}
