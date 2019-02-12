package dataStructures;

import java.util.Scanner;
public class StackDemo
{
	public void stackImplementation()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Stack:");
		int n=s.nextInt();
		Stack stk=new Stack(n);
		for(;;)
		{
			System.out.println("1.Push\n2.Pop\n3.Display\nEnter your choice");
			int choice = s.nextInt();
			int item;
			switch(choice)
			{
			case 1: System.out.println("Enter the element to be pushed:");
					item=s.nextInt();
					stk.push(item);
					break;
			case 2: item=stk.pop();
					if(item!=0)
						System.out.println("Element popped="+item);
					break;
			case 3:	stk.show();
					break;
			default:System.exit(0);
					s.close();
			}
		}
	}
}
