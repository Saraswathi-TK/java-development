class ChatCenterRunner
{
	public static void main(String[] suhas)
	{
		float rating=3.5f;
		ChatCenter.setRating(rating);
		System.out.println(ChatCenter.rating);
		
		String[] ChatItems={"pani puri", "Gobi"};
		System.out.println("total chat Items"+ChatItems.length);
		
		ChatCenter.setItem(ChatItems);
		String itemPassed=suhas[0];
		System.out.println("itemPassed "+itemPassed);
		double price=ChatCenter.serveSnacks(itemPassed);
		System.out.println(price);
	}
}