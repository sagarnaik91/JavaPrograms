package array;

public class PrintLargestInArray {

	public static void main(String [] args)
	{
		int[] arr= {1,2,3,4};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest is "+max);
	}
}
