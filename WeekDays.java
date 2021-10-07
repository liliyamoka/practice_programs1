import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number:");
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.print("SUNDAY");
		}
		else if(num==2)
		{
			System.out.print("MONDAY");
		}
		else if(num==3)
		{
			System.out.print("TUESDAY");
		}
		else if(num==4)
		{
			System.out.print("WEDNESDAY");
		}
		else if(num==5)
		{
			System.out.print("THURSDAY");
		}
		else if(num==6)
		{
			System.out.print("FRIDAY");
		}
		else if(num==7)
		{
			System.out.print("SATURDAY");
		}
		else {
			System.out.print("Enter correct day number");
		}

	}

}
