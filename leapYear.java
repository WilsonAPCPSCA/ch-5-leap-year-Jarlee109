import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a year and I'll tell you if it's a leap year: ");
		int year = in.nextInt();
		boolean check = isLeapYear(year);
		if (check == true){
			System.out.println("It's a leap year");
		}else{
			System.out.println("It's not a leap year");
		}

	}
	public static boolean isLeapYear(int year){
		boolean leap;
		if (year%4 == 0){
			leap = true;
		}else{
			leap = false;
		}
		if (year%100 == 0){
		    leap = false;
		}
		if (year%400 == 0){
			leap = true;
		}
		return leap;
	}

}
