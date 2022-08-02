package sorting;

public class BinarySearch {
	public static void main(String[]args)
	{
		int arr[]= {3,5,8,9,11};
		int key =11;
		int arrlen=arr.length;
		binarySearch(arr,0,key,arrlen);
	}
	public static void binarySearch(int arr[],int start,int key,int length)
	{
		int midvalue=(start+length)/2;
		
		while (start<=length) {
			if (arr[midvalue]<key) {
				start=midvalue+1;
				
			}
			else if (arr[midvalue]==key){
			      System.out.println("Elemnt is found at index"+midvalue);
			      break;
			}
			else
			{
				length=midvalue-1;
				
			}
			midvalue =(start+length)/2;
			
		}
		if (start > length)
		{
			System.out.println("Elemnt is not found");
		}
	}
}
