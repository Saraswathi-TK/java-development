class CyberShop extends Shop
{
	int since;
	String ownerName;
	int noOfSystem;
	
	void open()
	{
		System.out.println("cybershop open in mornig"+open);
	}
	void close()
	{+
		System.out.println("cybershop close in night"+close);
	}
	void connectToInternet()
	{
		System.out.println("cybershop connectToInternet all computer"+connectToInternet);
	}
}