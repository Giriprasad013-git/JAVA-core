class Program2
{
		static int a;	//Single line static initializer

		
		public static void main(String args[])
		{	
			int a = 55;
			System.out.println(a);
		}
		static 	//Multi line static initializer
		{
			a = 7;
			System.out.println(a);
		}
		static 	//Multi line static initializer
		{
			System.out.println(a);
		}
		
}
