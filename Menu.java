package dataStructures;
import java.util.Scanner;


public class Menu 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Choose the data structures:\n"
					+ "1.Array\n"
					+ "2.Linked List\n"
					+ "3.Stack\n"
					+ "4.Queue\n"
					+ "5.Trees\n"
					+ "6.Graphs\n"
					+ "5.Exit\n");
			System.out.println("Enter your choice :");
			int choice=sc.nextInt();
			switch(choice) 
			{
				case 1://array
						System.out.println("\nArray selected\n\n");
						Array a1=new Array();
						a1.arrayImplementation();
						break;
				case 2://linked list
						System.out.println("\nLL selected\n\n");
						break;
				case 3://Stack
						System.out.println("\nStack selected\n\n");
						StackDemo s1=new StackDemo();
						s1.stackImplementation();
						break;
				case 4://Queue
						System.out.println("\nQueue selected\n\n");
						break;
				case 5://Exit
						sc.close();
						System.exit(0);
				default:System.out.println("\nInvalid Choice please Enter again\n\n");			
			}
		}
	}
}
