class  for_5
{
	public static void main(String[] args) 
	{
// exp3 is optional
		for(int i=0;i<=10;)   
		{
			System.out.println("Inside loop");
			i+=1;
		}

// we can give a Statement inplace of exp3
		for (int i=0;i<=10;System.out.println("hello"))
		{
			System.out.println("1");
			i=i+1;
		}
	}
}
