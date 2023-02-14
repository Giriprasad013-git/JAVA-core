public class swapWithout3rdV {
    static void swaping2no(int m,int n)
	{
        m=m+n;
        n=m-n;
        m=m-n;
		System.out.println("The m = "+m+" and n = "+n+"\n");
	}

	public static void main(String args[])
	{
		int m=4,n=6;
		System.out.println("The m = "+m+" and n = "+n+"\n");
		swaping2no(m,n);
	}
}
