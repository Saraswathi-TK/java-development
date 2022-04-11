class  Fridge
{
	static  String Company;
	static int Capacity;
	static double Rating;
	
	static void details()
	{
		System.out.println("Fridge is a very good quality");
		System.out.println(Company);
		System.out.println(Capacity);
	    System.out.println(Rating);
	}
	
	static void init(String Company)
	{
		Fridge.Company=Company;
	}
	static void init(int Capacity)
	{
		Fridge.Capacity=Capacity;
	}
	static void init(double Rating)
	{
		Fridge.Rating=Rating;
	}
	static void init(String Company,int Capacity,double Rating)
	{
		System.out.println("hp is very good Company"+Company);
		System.out.println("its very good Capacity"+Capacity);
		System.out.println("its very good Rating"+Rating);
		

	}
}
