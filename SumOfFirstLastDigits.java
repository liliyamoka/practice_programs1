import java.util.Scanner;

public class SumOfFirstLastDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstdigit=0,lastdigit=0,sum=0;
		System.out.print("enter number : ");
		int num=sc.nextInt();
		lastdigit=num%10;
		System.out.println("lastdigit : "+lastdigit);
		while(num!=0)
		{
			firstdigit=num%10;
			num=num/10;
			sum=firstdigit+lastdigit;
			
		}
		System.out.println("firstdigit : "+firstdigit);
		System.out.println("sum of first and last digit of a number : "+sum);
	}

}
