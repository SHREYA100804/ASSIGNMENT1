import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int n1=sc.nextInt();
		System.out.println("enter the 2nd number");
		int n2=sc.nextInt();
		for (int i=n1+1;i<n2;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					isPrime =false;
				    break;
				}
				
			}
			if( isPrime && i>1)
			{
				System.out.print(i+" ");
		    }
		
		
			
		}

	}

}
