class Bus1
{	
	long busno;
	String busdesti;
	long buspickup;
	long noofseats;
	passenger p;
	Bus1(){}
	Bus1(long busno,String busdesti,long buspickup,long noofseats,passenger p)
	{
		this.busno=busno;
		this.busdesti=busdesti;
		this.buspickup=buspickup;
		this.noofseats=noofseats;
		this.p=p;
	}
}

class passenger
{
	String sname;
	long pcno;
	passenger(){}
	passenger(String sname,long pcno)
	{
		this.sname=sname;
		this.pcno=pcno;
	}
}

class Bus
{
	public static void main(String args[])
	{
		Bus1 b1=new Bus1(1,"Delhi",50,52,new passenger("Giri",9901066));
		
		System.out.println(b1.busno);
		System.out.println(b1.busdesti);
		System.out.println(b1.buspickup);
		System.out.println(b1.noofseats);
		System.out.println(b1.p.sname);
		System.out.println(b1.p.pcno);
	}
}
