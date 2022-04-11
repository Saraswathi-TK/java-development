class CarBrandsRunner
{
	public static void main(String[] values)
	{
		CarBrands[] carBrands=CarBrands.values();
		
		for(int index=0;index<carBrands.length;index++)
		{
			CarBrands temp=carBrands[index];
			System.out.println(temp);
		}			
			
			
		}
}