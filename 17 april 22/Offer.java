class Offer
{
	String name;
	double duration;
	
	Offer(String name,double duration)
	{
		this.name=name;
		this.duration=duration;
	}
	
	void discount(int amount)
	{
		if(amount>50)
		{
		System.out.println(" discount is apply"+amount);
		}
		else
		{
			System.out.println("discount is not apply"+amount);
		}
	}
 	void redeemPoints(int point)
	{
		if(point>10)
		{
		System.out.println("Point is apply to Discount item"+point);
		}
		else{
			System.out.println("Point is not apply to Discount item"+point);
		}
	}
}