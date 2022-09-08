class Account1
{
	private long accNo;
	private String pswd;
	private String name;
	private String city;
	private String branchofBank;
	
	Account1(){}
	Account1(long accNo,String pswd,String name,String city,String branchofBank)
	{
		this.accNo=accNo;
		this.pswd=pswd;
		this.name=name;
		this.city=city;
		this.branchofBank=branchofBank;
	}
	
	public long getAccNo()
	{
		return accNo;
	}
	public String getName()
	{
		return name;
	}
	public String getCity()
	{
		return city;
	}
	public String getBob()
	{
		return branchofBank;
	}
	public void setPswd(String pswd)
	{
		this.pswd=pswd;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setBob(String branchofBank)
	{
		this.branchofBank=branchofBank;
	}
}

class Account
{
	public static void main(String args[])
	{
		Account1 A1 = new Account1(1111,"Hellopswd","Giri","Mangalore","Athani");
		System.out.println(A1.getAccNo());
		System.out.println(A1.getName());
		System.out.println(A1.getCity());
		System.out.println(A1.getBob());
		A1.setPswd("Changed Password");
		A1.setCity("Vijaypur");
		A1.setBob("Tikota");	
		System.out.println();
		System.out.println(A1.getAccNo());
		System.out.println(A1.getName());
		System.out.println(A1.getCity());
		System.out.println(A1.getBob());
	}
}
	
	
	
