import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find the series");
		int n=sc.nextInt();
		int a=0,b=1,c=1;
		int sum=0;
		if(n>3)
		{
			System.out.print(a+" "+b+" "+c+" ");
			for (int i=4;i<=n;i++)
			{
				sum=a+b+c;
				System.out.print(sum+" ");
				a=b;
				b=c;
				c=sum;
			}
		}
		else
		{
			System.out.print("enter a number greater than 3");
		}
		

	}

}
