class ParkRunner
{
	public static void main(String[] valuse)
	{
		Park park=new Park();
		park.name="lalbag";
		System.out.println(park.name);
		park.noOfTrees=20;
		System.out.println(park.noOfTrees);
		park.solarPowered=true;
		System.out.println(park.solarPowered);
		
		CubbonPark park1=new CubbonPark();
		CubbonPark casting=(CubbonPark)park1;
		park1.petsAllowed=true;
		System.out.println(park1.petsAllowed);
		
		JinkePark park2=new JinkePark(); 
		JinkePark Case=(JinkePark)park2;
		park2.couplesAllowed=false;
		System.out.println(park2.couplesAllowed);
		
		
		
		
		
		
	}
}