class switch_ 
{
	public static void main(String[] args) 
	{
// integer datatype
		int i=5;
		switch(i)
		{
			case 0:
				System.out.println("i is zero");
			break;

			case 1:
				System.out.println("i is one");
			break;

			case 2:
				System.out.println("i is two");
			break;

			default:
				System.out.println("please enter number between 0 and 2");
			break;
			}
// Character datatype
		char c='A';
		switch(c){
			case 'A':
				System.out.println("AAA");
				break;
			case 'B':
				System.out.println("BBB");
				break;
			default:
				System.out.println("default");
				break;
		}
// string datatype
	String str="abc";
	switch(str){
		case "aaa":
			System.out.println("aaa");
		break;
		case "abc":
			System.out.println("abc");
		break;
		default:
			System.out.println("default");
		break;
	}
	}
}
