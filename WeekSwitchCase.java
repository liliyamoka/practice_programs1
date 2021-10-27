//Write a java program to print day of week name using switch case
import java.util.Scanner;
public class WeekSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num:");
		int num=sc.nextInt();	
		switch(num)
		{
		case 1 :System.out.print("sunday");
		break;
		case 2 :System.out.print("monday");
		break;
		case 3 :System.out.print("tuesday");
		break;
		case 4 :System.out.print("wednesday");
		break;
		case 5 :System.out.print("thursday");
		break;
		case 6 :System.out.print("friday");
		break;
		case 7 :System.out.print("saturday");
		break;
		}
	}

}
