class Whatsapp  
{
	private String username;
	private long cno;
	private String status;
	
	Whatsapp(){}
	Whatsapp(String username,long cno,String status){
		this.username=username;
		this.cno=cno;
		this.status=status;
		}
	public String getUsername()
	{
		return username;
	}
	public long getCno()
	{
		return cno;
	}
	public String getStatus()
	{
		return status;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	
}
	
class Wapp    //accessing private variable from another class with using method
{
	public static void main(String args[])
	{
		Whatsapp w1= new Whatsapp("GIRIPRASAD",66019,"Marrid");
		System.out.println(w1.getUsername());
		System.out.println(w1.getCno());
		System.out.println(w1.getStatus());
		
		w1.setUsername("GIRI");
		System.out.println(w1.getUsername());
	}
}
