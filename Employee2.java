class Employe
{
	private long empId;
	private String ename;
	private long cno;
	private String loc;
	private String Dept;
	private long sal;
	
	Employe(){}
	Employe(long empId,String ename,long cno,String loc,String Dept,long sal)
	{
		this.empId=empId;
		this.ename=ename;
		this.cno=cno;
		this.loc=loc;
		this.Dept=Dept;
		this.sal=sal;
	}
	
	public long getEmpid()
	{
		return empId;
	}
	public String getEname()
	{
		return ename;
	}
	public long getCno()
	{
		return cno;
	}
	public String getLoc()
	{
		return loc;
	}
	public String getDept()
	{
		return Dept;
	}
	public long getSal()
	{
		return sal;
	}
	public void setCno(long cno)
	{
		this.cno=cno;
	}
	public void setLoc(String loc)
	{
		this.loc=loc;
	}
	public void setDept(String Dept)
	{
		this.Dept=Dept;
	}
	public void setSal(long sal)
	{
		this.sal=sal;
	}
}

class Employee2
{
	public static void main(String args[])
	{
		Employe Em = new Employe(1,"Giriprasad",99010,"Athani","CSE",10000);
		System.out.println(Em.getEmpid());
		System.out.println(Em.getEname());
		System.out.println(Em.getCno());
		System.out.println(Em.getLoc());
		System.out.println(Em.getDept());
		System.out.println(Em.getSal());
		Em.setCno(66019);
		Em.setLoc("Belagavi");
		Em.setDept("CS");
		Em.setSal(900000);
		System.out.println();
		System.out.println(Em.getEmpid());
		System.out.println(Em.getEname());
		System.out.println(Em.getCno());
		System.out.println(Em.getLoc());
		System.out.println(Em.getDept());
		System.out.println(Em.getSal());
	}
}
	
	
	
