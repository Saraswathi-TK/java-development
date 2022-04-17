class SuperOffer extends Offer
{

	boolean holiday;
	
	SuperOffer(String name,double duration,boolean holiday)
	{
		super(name,duration);
		this.holiday=holiday;
	}
	
	void totalCost(double cost)
	{ 
	
		System.out.println("totalCost:"+cost);
		
	}
}