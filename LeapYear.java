// Write a java program to check whether a year is leap year or not
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any year:");
		int year = sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0)
		{
			System.out.print(year+" is a leap year");
		}
		else {
			System.out.print(year+" is not a leap year");
		}

	}

}
