class A
{	
	int sum=0;
	float mul=1;
	int add(int ... a)
	{
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

	float multiply(float f,int ...a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			mul=mul*a[i];
		}
		return mul*f;
	}
}
class var_arg_methods_1 
{
	public static void main(String[] args) 
	{
		System.out.println("Sum of variable arguments : ");
		A a=new A();
		System.out.println("The sum of parameters is : "+a.add(12,34,56,100));
		System.out.println("The multiplication of parameters is : "+a.multiply(1.5f,12,34,56,100));
	}
}
