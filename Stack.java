package dataStructures;

public class Stack 
{
	int a[];
	int top;
	public Stack(int n)
	{
		a=new int[n];
		top=-1;
	}
	public void push(int n)
	{
		if(top==a.length-1)
			System.out.println("Stack Overflow");
		else
			a[++top]=n;
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
			return(a[top--]);
	}
	void show()
	{
		if(top==-1)
			System.out.println("Stack Empty");
		else
		{
			System.out.println("Stack elements are :");
			for(int i=top;i>=0;i--)
				System.out.println(a[i]);
		}
	}
}

