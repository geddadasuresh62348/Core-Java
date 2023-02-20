class while_2
{
	public static void main(String[] args) 
	{
		System.out.println("Before loop");
		int i=0;
		while(true)		// unreachable loop
		{
			System.out.println("Inside loop");
			i++;
		}
		System.out.println("outside loop");
	}
}
