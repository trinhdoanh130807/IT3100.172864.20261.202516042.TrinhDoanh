import java.util.Scanner;
public class TriangleStars {
	public static void main (String args[]) {
		System.out.println("Input n: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n < 0) {
			System.out.println("ERROR");
		}
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
