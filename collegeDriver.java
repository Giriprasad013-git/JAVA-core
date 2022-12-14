import java.util.Scanner;
class Student
{
	private String sname;
	private String email;
	private long cno;

	Student(){}
	Student(String sname,String email,long cno)
	{
		this.sname = sname;
		this.email = email;
		this.cno = cno;
	}
	public String getSname()
	{
		return sname;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public long getCno()
	{
		return cno;
	}
	public void setCno(long cno)
	{
		this.cno = cno;
	}
}
class College
{
	String location;
	Student s;
	College() {}
	College(String location)
	{
		this.location = location;
	}
	public void getAdmission(Student s)
	{
		if(this.s==null)
		{
			this.s = s;
		}
		else
		{
			System.out.println("Students are already present");
		}
	}
	public void removeStudent()
	{
		if(this.s==null)
		{
			System.out.println("Students are not present");
		}
		else
		{
			this.s = null;
			System.out.println("Student removed");
		}
	}
	public void updateStudent()
	{
		if(this.s==null)
		{
			System.out.println("Students are not present");
		}
		else
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the email id to update");
			String email=sc.next();
			s.setEmail(email);
			System.out.println("enter the contact number to update");
			long cno=sc.nextLong();
			s.setCno(cno);
			System.out.println("student info updated");
			System.out.println("__");
		}
	}
	public void displayDetails()
	{	
  		if (this.s==null)
  		{
  			System.out.println("students are not there");
  		}
		else
		{
			System.out.println("students name : "+s.getSname());
			System.out.println("students email is : "+s.getEmail());
			System.out.println("students cno is : "+s.getCno());
			System.out.println("students location is  : "+location);
		}
	}
}


class collegeDriver
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		College c = new College("Belagavi");
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your choice :\n1.To get admission\n2.to remove student\n3.to update student\n4.to display student\n5.Exit\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			
				case 1 : System.out.println("Enter the name of the student ");
					 String sname = sc.next();
					 System.out.println("Enter the email of student ");
					 String email = sc.next();
					 System.out.println("Enter the cno of the student");
					 long cno = sc.nextLong();
				 	 c.getAdmission(new Student(sname,email,cno));
				 	 System.out.println("Admission successfull");
				 	 break;
				 
				case 2 : c.removeStudent();
					 break;
				case 3 : c.updateStudent();
					 break;
				case 4 : c.displayDetails();
					 break;
				case 5 : exit=false;
					 break;
				default : System.out.println("Currect choice hakooo");
			}
		}
	}
}






















































