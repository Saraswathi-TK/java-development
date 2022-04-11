class Property
{
	
	static String name="chandu";
	static String[] brand;
	
	static double setBrand(String[] brand)
	{
	Property.brand=brand;
	}
	if(brand!=null)
	{
		for(int index=0; index<Property.brand.length; index++)
		{
			String element=Property.brand[index];
			if(element.equals("Home") && element.equals(brand))
			{
				System.out.println("brand name"+brand);
				return 30;
			}
			if(brand.equals("Properties") && brand.equals(brand))
			{
				System.out.println("brand name"+brand);
				return 50;
			}
		}
	}
	return-1;
}
}