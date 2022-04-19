class CameraSeller
{
	void sell(int nos)
	{
		System.out.println("runner sell,passing nos");
		System.out.println(nos);
	}
	void sell(String item)
	{
		System.out.println("runner sell,passing string");
		System.out.println(item);
		item.equals("test");
	}
	void sell(Camera item)
	{
		System.out.println("running sell,passing camera");
		if(item instanceof Camera)
		{
          System.out.println(item.brand);
		  System.out.println(item.price);
		  System.out.println("item is camera");
		}			
		if(item instanceof SonyCamera)
		{
			SonyCamera sony=(SonyCamera)item;
			System.out.println(sony.modelNo);
			System.out.println("item is sony");
		}
		if(item instanceof NikonCamera)
		{
			System.out.println("item is nikon");
		}
	}
}