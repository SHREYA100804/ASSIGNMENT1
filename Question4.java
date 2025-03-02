import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int m=sc.nextInt();
		System.out.println("enter the 2nd number");
		int n= sc.nextInt();
		if(m<n&&m>0&&n>0)
		{
			for (int i=m;i<=n;i++)
			{
				int fact=1;
				for (int j=i;j>0;j--)
					{
					  fact*=j;
					}
			 System.out.println("the factaorial of"+ i +" is "+ fact);	
			}
			
		}
			
	}

}
   