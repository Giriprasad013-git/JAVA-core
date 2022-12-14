import java.util.*;
class Sim1
{
	String serviceprovidor;
	String color;
	long simNo;
	Sim1(){}
	Sim1(String serviceprovidor,String color,long simNo)
	{
		this.serviceprovidor=serviceprovidor;
		this.color=color;
		this.simNo=simNo;
	}
}


class Mobile
{
	String brand;
	double price;
	Sim1 s;
	Mobile(){}
	Mobile(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	public void insertSim(Sim1 s)
	{
		if(this.s==null)							
		{
			this.s=s;
			System.out.println("Sim is inserted");
		}
		else
		{
			System.out.println("Sim is alredy inserted");
		}
	}
	public void removeSim()
	{
		if(this.s==null)
		{
			System.out.println("Sim is not inserted");
		}
		else
		{
			this.s=null;
			System.out.println("Sim is removed");
		}
	}
	public void displaySim()
	{
		
		if(this.s==null)
		{
			System.out.println("Sim is not inserted");
		}
		else
		{	
			System.out.println("Displayed from displaySim() method");
			System.out.println(brand);
			System.out.println(price);
			System.out.println(s.serviceprovidor);
			System.out.println(s.color);
			System.out.println(s.simNo);
		}
	}
}

class Sim
{
	public static void main(String args[])
	{
		Mobile m1 = new Mobile("oppo",40000);
		boolean exit = true;
		while(exit)
		{
			System.out.println("1.Insert sim\n2.remove sim\n3.display sim\n4.Exit\n");
			Scanner sc= new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter the service providor");
					 String serviceprovidor=sc.next();
					 System.out.println("Enter the sim color");
					 String color=sc.next();
					 System.out.println("Enter the sim number");
					 long simNo=sc.nextLong();
					 m1.insertSim(new Sim1(serviceprovidor,color,simNo));
					 break;
				case 2 : m1.removeSim();
					 break;
				case 3 : m1.displaySim();
					 break;
				case 4 :exit=false;
					 break;
				default : System.out.println("Enter the valid choice");
			}
		}
	}
}
		
