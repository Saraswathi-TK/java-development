class Wineshop
{
	static String name="Ramesh Wineshop";
	static String location="BTM";
	static String ownerName="Ramesh";
	static int gstNumber=9;
	static int licenseNumber=20122345;
	
	
	
	static void sellingLiquor(String liquorName,double money,int quantity)
	{
		double priceofLiquor=0;
		if(liquorName !=null && liquorName=="KingFisher" || liquorName=="Tubour" || liquorName=="Budwiser")
		{
			
		System.out.println("valid liquorName"+liquorName);
		}		
		if(liquorName=="KingFisher")
		{
			money=130;
		}
		if(liquorName=="Tubour")
		{
			money=120;
		}
		if(liquorName=="Budwiser")
		{
	      money=100;
		}
	
		else
		{
			System.out.println("invalid liquorName"+liquorName);
			return;
		}
	
	if(money>=50)
	{
		System.out.println("valid money"+money);
	}
	else
	{
		System.out.println("invalid money"+money);
	}
	
	 double totalprice=priceofLiquor*quantity;
	if(quantity>2 && quantity<=20)
	{
		System.out.println("valid quantity"+quantity);
		if(money>=50)
		{
			totalprice=priceofLiquor*quantity;
			System.out.println("liquor is soldout at price"+money);
			}
	}
	else
	{
		System.out.println("invalid quantity"+quantity);
		
	}
	
}
static void details()
{
	System.out.println("wineshop details");
	
    System.out.println(name);
	System.out.println(location);
	System.out.println(ownerName);
	System.out.println(gstNumber);
	System.out.println(licenseNumber);	
}
}
