
class MaximumNumber 
{
	public static void main(String args[])
	{
		int a = 10, b = 25, c = 15, max;
		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Maximum number among " + a + ", " + b + " and " + c + " is " + max);
	}
}

