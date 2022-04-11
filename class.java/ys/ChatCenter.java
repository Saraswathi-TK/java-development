class ChatCenter
{
	static String name="saru";
	static String[] item;
	static String location="BTM";
	static float rating;
	
static void setItem(String[] item)
{
	ChatCenter.item=item;
}

static void setRating(float rating)
{
	ChatCenter.rating=rating;
}

static double serveSnacks(String item)
{
	if(item!=null)
	{
		for(int index=0; index<ChatCenter.item.length; index++)
		{
			String element=ChatCenter.item[index];
			if(element.equals("pani puri") && element.equals(item))
			{
				System.out.println("item name"+item);
				return 30;
			}
			if(item.equals("Gobi") && item.equals(item))
			{
				System.out.println("item name"+item);
				return 50;
			}
		
		}
	}
	return -1;
}
}
