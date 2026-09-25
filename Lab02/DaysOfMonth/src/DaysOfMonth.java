import java.util.Scanner;

public class DaysOfMonth {
	public static void main (String args[] ){
		Scanner nc = new Scanner(System.in);
		
		String[] monthName = {"template" , "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		String[] month3CharPo = {"temp" , "Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec." };
		String[] month3Char = {"temp" , "Jan", "Feb", "Mar", "Apr","May" ,"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		String[] monthIndex = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		
		while (true) {
			System.out.println("Input year: ");
			String strYear = nc.nextLine().trim();
			int year;
			
			try {
				year = Integer.parseInt(strYear);
				if(year < 0) {
					System.out.println("Invalid year. Please enter again.\n");
					continue; 
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Invalid year. Please enter again.\n");
				continue; 
			}
			
			System.out.println("Input month: ");
			String month = nc.nextLine(); 
			int flag = 0;
			for ( int i = 1; i <= 12; i++) {
				if( month.equals(monthName[i]) || month.equals(month3CharPo[i]) || month.equals(month3Char[i]) || month.equals(monthIndex[i]) ) {
					flag = 1;
					
					if( i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
						System.out.println("This month has 31 days");
					}
					else if( i == 2 ) {
						if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
							System.out.println("This month has 29 days");
						} else {
							System.out.println("This month has 28 days");
						}
					}
					else {
						System.out.println("This month has 30 days");
					}
					break; 
				}
			}
			
			if(flag == 0) {
				System.out.println("Invalid month, please enter again.");
			} else {
				break;
			}
		}
		
		nc.close();
	}
}