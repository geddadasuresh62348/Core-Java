class switch_1 
{
	public static void main(String[] args) 
	{
		byte i=125;
		switch(i)
		{
			case 125:
				System.out.println("i is zero");
			break;

			case 126:
				System.out.println("i is one");
			break;

			case 128:
				System.out.println("i is two");// returns error as the case value is not in the range of byte 
			break;

			default:
				System.out.println("please enter number between 0 and 2");
			break;
			}
	}
}
