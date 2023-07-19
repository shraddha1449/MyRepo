package assignment_array7;
public class SumEvenOdd
{
public static void main(String args[])
{ 
int evenSum=0, oddSum=0;

int arr[] = new int[] {26,18,15,11,7,84};

for(int i=0;i<arr.length;i++)
{
	if(arr[i]%2==0)
	{
	evenSum+=arr[i];	
	}
	else
	{
		oddSum+=arr[i];
	}
}
System.out.println("sum of even numbers "+ evenSum);
System.out.println("sum of odd numbers "+ oddSum);
}
}