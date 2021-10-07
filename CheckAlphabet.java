import java.util.Scanner;
public class CheckAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any character:");
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.print(ch+" is a Alphabet");
		}
		else {
			System.out.print(ch+" not a Alphabet");
		}

	}

}
