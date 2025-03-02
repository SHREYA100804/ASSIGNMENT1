import java.util.Scanner;
public class Question8 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a limit");
		int n= sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=(i*(i+1))/2;
		}
		System.out.println(sum);	

	}

}
