class MallRunner
{
	public static void main(String[] args)
	{
		Mall mall=new Mall();
		Offer off=new Offer("Home Appliance",24);
		off.discount(2500);
		off.redeemPoints(13);
		mall.shopping(off);
		System.out.println(off.name);
		System.out.println(off.duration);
		
		SuperOffer off1=new SuperOffer("tv",12,true);
		mall.shopping(off1);
		
		BumperOffer off2=new BumperOffer("iphone",10,"Phone");
		mall.shopping(off2);
	}
}