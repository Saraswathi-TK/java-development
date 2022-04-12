class GoldMineRunner
{
	public static void main(String[] args)
	{
		GoldMine mine=new HotRaichurMine();
		RaichurMine mine1=new HotRaichurMine();
		RaichurMine mine2=new RaichurMine();
		GoldMine mine3=new SmartKolarGoldMine();
		KolarGoldMine mine4=new SmartKolarGoldMine();
		
		System.out.println(mine.location);
		System.out.println(mine1.location);
		System.out.println(mine2.location);
		System.out.println(mine3.location);
		System.out.println(mine4.location);
		
	}
}