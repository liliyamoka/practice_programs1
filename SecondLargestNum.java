import java.util.Scanner;
public class SecondLargestNum {

	public static void main(String[] args) {
		int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        size = arr.length;
        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++) {
                if(arr[i]>arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        System.out.println("Third second largest number is: " + arr[size-2]);

	}

}
