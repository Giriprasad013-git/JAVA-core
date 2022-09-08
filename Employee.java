class Employee
{
	double sal;
	int empid;
	String ename;
	String dob;
	Employee()
	{
		System.out.println("Pass the arguments");
	}
	Employee(int empid,String dob,String ename)
	{
		this(empid,dob);     //this call statement it will call the another constructor //constructor chaining
		this.ename=ename;
	}
	
	Employee(int empid,String dob)    //if it is not there if we are calling this it will show COMPILE TIME ERROR
	{
		this.empid=empid;
		this.dob=dob;
	}

	Employee(int empid)
	{
		this.empid=empid;
	}
	Employee(String ename,String dob)
	{
		this.ename=ename;
		this.dob=dob;
	}
	Employee(String ename)
	{
		this.ename=ename;
	}
	
	public static void main(String args[])
	{
		Employee emp= new Employee(1);
		System.out.println("Employee id is : "+emp.empid);
		System.out.println("The employee name is : "+emp.ename);
		System.out.println("The employee dob is : "+emp.dob);
	}
}
