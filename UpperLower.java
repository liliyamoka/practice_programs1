//Write a java program to check whether a character is uppercase or lowercase     alphabet
import java.util.Scanner;
public class UpperLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter characters:");
		char ch =sc.next().charAt(0);
		if(ch >='a'&& ch<='z')
		{
			System.out.print(ch+" is lower case");
		}
		else if(ch >='A'&& ch<='B'){
			System.out.print(ch+" is upper case");
		}
		else {
			System.out.print("Enter characters only");
		}
	}

}
