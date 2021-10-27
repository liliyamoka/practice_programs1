//7. Write a java program to check whether a character is alphabet or not.
import java.util.Scanner;
public class AlphaNumSpcl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter characters:");
		char ch =sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.print(ch+" is Alphabet");
		}
		else if(ch >='0' && ch<='9')
		{
			System.out.print(ch+" is digits");
		}
		else {
			System.out.print("special characters");
		}
		

	}

}
