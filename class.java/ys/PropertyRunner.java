class PropertyRunner
{
public static void main(String[] args)
{
	String[] PropertyBrand={"Home", "Properties"};
    System.out.println("total brands"+PropertyBrand.length);
	//System.out.println(PropertyBrand[0]);
		//System.out.println(PropertyBrand[1]);
		
		Property.setBrand(PropertyBrand);
		String brandpassed=args[0];
		System.out.println("brandPassed "+brandPassed);
		double price=Property.setBrand(brandPassed);
		System.out.println(price);
	
}
}