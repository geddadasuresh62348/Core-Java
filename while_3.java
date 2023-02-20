class while_3
{
	public static void main(String[] args) 
	{
		System.out.println("Before loop");
		int i=0;
		while(false)		// unreachable statement
		{
			System.out.println("Inside loop");
			i++;
		}
		System.out.println("outside loop");
	}
}
