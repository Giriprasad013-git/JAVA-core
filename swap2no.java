class swap2no
{
	static void swaping2no(int m,int n)
	{
		int temp=m;
		m=n;
		n=temp;
		
		System.out.println("The m = "+m+" and n = "+n+"\n");
	}

	public static void main(String args[])
	{
		int m=4,n=6;
		System.out.println("The m = "+m+" and n = "+n+"\n");
		swaping2no(m,n);
	}
}
