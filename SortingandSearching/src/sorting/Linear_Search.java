package sorting;
import java.util.Scanner;
public class Linear_Search {
	public static void main(String[]args) {
		int arr[]= {10,30,50,70,80 };
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int Searchvalue=sc.nextInt();
		int result =(int)linear(arr,Searchvalue);
		if (result ==-1)
		{
			System.out.println("Element not found in array");
			
		}
		else {
			
			System.out.println("Element found at "+result+"Search key is" +arr[result]);
		}
	}
public static int linear(int arr[],int x)
	{
		int arrlength=arr.length;
		for (int i=0;i<(arrlength-1);i++) {
			if(arr[i]==x)
			{
				return i;
			}
			
		}
		return -1;
	}
}
