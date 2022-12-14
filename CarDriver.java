class car
{
	String brand;
	String color;
	int noOFSeats;
	Engine e;
	car(){}
	car(String brand,String color,int noOFSeats,Engine e)
	{
		this.brand = brand;
		this.color = color;
		this.noOFSeats=noOFSeats;
		this.e=e;	
	}
}

class CarDriver
{
	public static void main(String[] args)
	{
		car c1 = new car("Audi","Black",3,new Engine(9999338,2000));
		System.out.println(c1.brand);
		System.out.println(c1.color);
		System.out.println(c1.noOFSeats);		
		System.out.println(c1.e.cc);
	}
}

class Engine
{
	int enginNo;
	int cc;
	
	Engine(){}
	
	Engine(int enginNo,int cc)
	{
		this.enginNo=enginNo;
		this.cc=cc;
	}
}		
