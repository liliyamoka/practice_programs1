import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number : ");
		int num=sc.nextInt();
		  
		    boolean p= false;
		    for (int i = 2; i <= num / 2; ++i) {
		    
		      if (num % i == 0) {
		        p= true;
		        break;
		      }
		    }

		    if (!p)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
	}

}
