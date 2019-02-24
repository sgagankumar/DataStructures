package dataStructures;
//
import java.util.Scanner;
public class Array
{
	public void arrayImplementation()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1) 1D Array\n"
								+"2) 2D Array\n");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("1D ARRAY");
						onedarray();
						break;
				case 2:System.out.println("2D ARRAY");
						twodarray();
						break;
				case 3:System.out.println("<-- BACK");
						sc.close();
						return;
				default:System.out.println("Invalid Option Enter Again..!!");
			}
		}
		
	}
	
	public static void onedarray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+ n + " Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements in the array are :\n");
		for(int i=0;i<n;i++)
		{
			System.out.println("\t" + arr[i]);
		}
		sc.close();
	}
	
	public static void twodarray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array MxN: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter the M X N Elements:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements in the array are :\n");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("\t" + arr[i]);
			}
			System.out.println();
		}
		sc.close();
	}
}
