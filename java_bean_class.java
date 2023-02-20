//java beans classes rules and regulations
/*
1.In java bean classes Every variable must be private and every method must be public
2.For every variable separate setter and getter methods we should provide
3.
*/
class User
{
	private String uname;
	private String upwd;

	public void setUname(String name)
	{
		uname=name;
	}
	public void setUpwd(String pwd)
	{
		upwd=pwd;
	}
	public String getUname()
	{
		return uname;
	}
	public String getUpwd()
	{
		return upwd;
	}
}
class Employee
{
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
// Mutator methods
	public void setEno(int emp_no)
	{
		eno=emp_no;
	}
	public void setEname(String emp_name)
	{
		ename=emp_name;
	}
	public void setEsal(float emp_sal)
	{
		esal=emp_sal;
	}
	public void setEaddr(String emp_addr)
	{
		eaddr=emp_addr;
	}
// Accessor methods
	public int getEno()
	{
		return eno;
	}
	public String getEname()
	{
		return ename;
	}
	public float getEsal()
	{
		return esal;
	}
	public String getEaddr()
	{
		return eaddr;
	}
}
class java_bean_class 
{
	public static void main(String[] args) 
	{
		System.out.println("Java bean class examples");
		User u=new User();
		u.setUname("abc");
		u.setUpwd("abc123");
		System.out.println(u.getUname());
		System.out.println(u.getUpwd());
System.out.println();
		Employee e=new Employee();
		e.setEno(1);
		e.setEname("too too boy");
		e.setEsal(34000.23f);
		e.setEaddr("youtube");
		System.out.println("Employee Details : ");
		System.out.println("------------------");
		System.out.println("Employee number : "+e.getEno());
		System.out.println("Employee name   :"+e.getEname());
		System.out.println("Employee salary :"+e.getEsal());
		System.out.println("Employee address:"+e.getEaddr());
	}
}
