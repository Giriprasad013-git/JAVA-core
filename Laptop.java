class Laptop
{	
	String brand;       
	double price;
	String color;
	Laptop(String brand,double price,String color)    //paramitarized constructor
	{
		this.brand=brand;   //this. key word holds the reference of the current object
 		this.price=price;
		this.color=color;
	}
	public static void main(String args[])
	{
		
		Laptop lap1 = new Laptop("DELL",40000,"Black");    //Hear "new" is a constructor		
		Laptop lap2 = new Laptop("HP",50000,"White");    
		
//		lap.brand = "DELL";    // we can directly use like this but for the shake of 		
//		lap.price = 40000;     //the paramitarized constructor we not are using stis part
//		lap.color = "Black";
		System.out.println("The brand of the laptop is "+lap1.brand);
		System.out.println("The price of the laptop is "+lap1.price);
		System.out.println("The color of the laptop is "+lap1.color);
	
		System.out.println();
		
		System.out.println("The brand of the laptop is "+lap2.brand);
		System.out.println("The price of the laptop is "+lap2.price);
		System.out.println("The color of the laptop is "+lap2.color);
	}
}

