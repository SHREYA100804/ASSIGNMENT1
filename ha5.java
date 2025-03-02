import java.util.Scanner;
public class ha5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int a=0,b=1,c;
		if (n==1)
		{
			System.out.print("fibonacci series is " + a  );
			
		}
		else
		{
			System.out.print("fibonacci series is " + a + " " + b );
		    for (int i=3;i<=n;i++)
		    {
             c=a+b;
        	 a=b;
        	 b=c;
        	 {
        	 System.out.print(c + " ");
        	 }
		    }
        }
	}

}
