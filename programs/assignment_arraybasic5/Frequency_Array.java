package assignment_arraybasic5;

public class Frequency_Array {
	
public static int freq(int arr[] , int num)
{
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==num)
		{
			count+=1;
		}
	}
	return count;
}
public static void main(String[] args)
{
	int flag=-1;
	int[] arr= new int[] {4,1,8,9,8,1,2,1,4,2};
	for(int i=0;i<arr.length;i++)
	{int temp=arr[i];
		for(int j=i+1;j<arr.length;j++)
		{
			
			if(arr[i]>arr[j])
			{
				arr[i]=arr[j];
				arr[j]=temp;
				temp=arr[i];
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		
		if(flag!=arr[i])
		{
		System.out.println("Number of Occurrence of the Element "+arr[i]+" is " + freq(arr,arr[i]));
	}
		flag=arr[i];
	}
}
}
