//write a program count even and odd elements in a array
import java.util.Scanner;
public class EvenOddArray {

	public static void main(String[] args) {
		 int ec=0,oc=0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of an array: ");
	        int size = sc.nextInt();
	        int arr[] =new int[size];
	        System.out.println("Enter array elements: ");
	        for(int i=0;i<size;i++) {
	            arr[i] = sc.nextInt();
	        }
	        for(int i = 0; i < size; i++) {
				if(arr[i] % 2 == 0) {
					ec++;
				}
				else {
					oc++;
				}
			}
		    System.out.println("Total number of even count: " + ec + "and total number of odd count: " + oc);
	}

}
