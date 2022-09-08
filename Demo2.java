class Demo2
	{
		static int b =88; 	//static initializer
		int a=88; 		//non static initializer
		{
			int a = 56; 
			System.out.println(a);
		}
		public static void main(String[] args) 
		{
			Demo2 d2 = new Demo2(); 
			System.out.println(d2.a);
		}
	}						
			
