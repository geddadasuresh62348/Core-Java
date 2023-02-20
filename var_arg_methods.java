class A
{
// fixed no.of arguments
	void add(int i,int j)
	{
		System.out.println("sum : "+(i+j));
	}

// variable argument method
	void addd(int ... a)
	{
		//System.out.println("var_arg_method");
		System.out.println("No.of parameters : "+a.length);
		System.out.print("Parameter List : ");
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.println("------------");

	}
}

class var_arg_methods 
{
	public static void main(String[] args) 
	{
		System.out.println("variable argument methods ");
		A obj=new A();
		obj.add(12,45);

		obj.addd();
		obj.addd(23);
		obj.addd(2,3);
		obj.addd(2,3,5);
	}
}
