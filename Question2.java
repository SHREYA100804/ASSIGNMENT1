import java.util.Scanner;
public class Question2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number");
		int num=sc.nextInt();
		int c=0;int rev=0;
		int c1=0;
		for(int i =2;i<=num/2;i++)
		{
			if (num%i==0)
				c++;
			break;
			
		}
		while(num>0)
		{ 
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		for (int j=2;j<=rev/2;j++)
		{
			if(rev%j==0)
				c1++;
			break;
		}
		if (c1==0&& c==0)
		{
			System.out.println("It is a twisted prime number");
		}
				
		else
		{
			System.out.println( "It is  not a twisted prime number");
		}

	}

}
