3EY7class EorO
{
	static void Even(int L,int R)
	{
		if(R<L)
		{
			return;
		}
		if(R%2==0)
			Even(L,R-2);
		else
			Even(L,R-1);
		
		if(R%2==0)
		{
			System.out.print(R+" ");
		}
	}
	
	static void Odd(int L,int R)
	{
		if(R<L)
		{
			return;
		}
		if(R%2==1)
			Odd(L,R-2);
		else
			Odd(L,R-1);
		
		if(R%2==1)
		{
			System.out.print(R+" ");
		}
	}
	public static void main(String args[])
	{
		int L=10,R=25;
		System.out.println("Even numbers");
		
		Even(L,R);
		System.out.println();
		
		System.out.println("Odd numbers");
		Odd(L,R);
	}
}
