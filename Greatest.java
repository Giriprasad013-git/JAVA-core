import java.util.*;
class Greatest
{
	public static void main(String args[])
	{
		
		int b= 20;
		int c =40;
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is gretest");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is gretest");
		}
		else
		{
			System.out.println(c+" is greatest");
		}
	}
}			
