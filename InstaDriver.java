class Instagram
{
private String username;
private long cno;
private String email;
private String location;
private String story;
private String pswd;

Instagram() {}

Instagram(String username,long cno ,String email,String location,String story, String pswd)
{
	this.username = username;
	this.cno = cno;
	this.email = email;
	this.location = location;
	this.story = story;
	this.pswd = pswd;
}

public String getUsername()
{
	return username;
}

public void setUsername(String username)
{
	this.username = username;
}

public long getCno()
{
	return cno;
}

public void setCno(long cno)
{
	this.cno = cno;
}

public void setEmail(String email)
{
	this.email = email;
}


public String getLocation()
{
	return location;
}

public void setLocation(String location)
{
	this.location = location;
}


public String getStory()
{
	return story;
}

public void setStory(String story)
{
	this.story = story;
}


public void setPswd(String pswd)
{
	this.pswd = pswd;
}
}
class InstaDriver
{
	public static void main(String[] args)
	{
		Instagram i = new Instagram("abcd",876543,"jdn@kdwl","Manipal","lalala","ertyu");
		System.out.println(i.getUsername());
		i.setUsername("abcde");
		System.out.println(i.getUsername());

		System.out.println(i.getCno());
		i.setCno(87654);
		System.out.println(i.getCno());

		
	
		System.out.println(i.getLocation());
		i.setLocation("Bangalore");
		System.out.println(i.getLocation());
			
		System.out.println(i.getStory());
		i.setStory("Mumbai");
		System.out.println(i.getStory());
	
		i.setPswd("Mangalore");

	}
}


