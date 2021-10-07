import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.print("Enter  n value");
		int n=sc.nextInt();
	    
	   while(n!=0)
	    {
		   n=n/10;
		   count++;
	    	
	    }
	   System.out.print("number of digits in a given Integer is : "+count);
	}

}
