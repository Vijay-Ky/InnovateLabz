class M2
{
	public static void main(String[] args) 
	{
		test();
		
		System.out.println("done");
	}
	static void test() 
	{
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}
		
	}
}
