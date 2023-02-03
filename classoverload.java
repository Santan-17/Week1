package programs;
import java.util.Scanner;
public class classoverload {
	int n;
	long d,sum=0;
	
	void sum(int n)
	{
		while(n>0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("The sum of the digits is : "+sum);

	}
	void sum(long n)
	{
		sum=0;
		while(n>0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("The sum of the digits is : "+sum);
	}
}

public class ClassAndObj1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		Overload o1=new Overload();
		o1.sum(a);
		o1.sum((long)a);
	}

}
}
