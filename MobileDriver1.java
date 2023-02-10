class Mobile
{
	String brand;
	double price;
	String color;
}

class MobileDriver1
{
	public static void main(String[] args)
	{
		Mobile mobile = new Mobile();    //Hear "new" is a constructor
		mobile.brand = "Samsung";
		mobile.price = 14000;
		mobile.color = "RED";
		
		System.out.println("The brand of the mobile is "+mobile.brand);
		System.out.println("The price of the mobile is "+mobile.price);
		System.out.println("The color of the mobile is "+mobile.color);
	}
}
