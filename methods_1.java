class A
{
	void m1()
	{
		System.out.println("m1 in class A");
	}
}
class B
{
	A getA()
	{
		A a=new A();
		return a;
	}
}
class methods_1 
{
	public static void main(String[] args) 
	{
		System.out.println("Returning a user defined data types : ");
		B b=new B();
		A a=b.getA();
		a.m1();
	}
}
