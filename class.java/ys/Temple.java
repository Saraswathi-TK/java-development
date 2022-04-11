class  Temple
{
	static  String Name;
	static  String Address;
	static int  Bell;
	static String Kumkum;
	static String Flowers;
	
	static void details()
	{
      
	  
		System.out.println(Name);
		System.out.println(Address);
	    System.out.println(Bell);
		System.out.println(Kumkum);
		System.out.println(Flowers);
	}
	
	
	
	static void init(String Name)
	{
		Temple.Name=Name;
		
	}
	static void initTemple(String Address)
	{
		Temple.Address=Address;
	}
	static void init(int Bell)
	{
		Temple.Bell=Bell;
		
	}
	static void inittemple(String Kumkum)
	{
		Temple.Kumkum=Kumkum;
	
	}
	static void inittemp(String Flowers)
	{
		Temple.Flowers=Flowers;
		
	}
	static void init(String Name,String Address,int Bell,String Kumkum,String Flowers)
	{
		System.out.println(" Name"+Name);
		System.out.println(" Address"+Address);
		System.out.println(" Bell"+Bell);
		System.out.println("Kumkum"+Kumkum);
		System.out.println("Flowers"+Flowers);
		

	}
}
