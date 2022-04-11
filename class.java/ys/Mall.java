class Mall
{
	static String name;
	static String location;
	static String ownerName;
	static int totalshop;
	static String open;
	
		static void initname(String name)
		{
				if(name=="orion")
				{
					Mall.name=name;
				System.out.println("name:"+name);
				}			
				
			else
			   {
				System.out.println("invalid name"+name);
				return;
			   }
		}
			
			static void initlocation(String location)
			{		
			if(location=="rajajinagara")
		    {
		   Mall.location=location;
	       System.out.println("location:"+location);
			}
		  else
		  {
		 System.out.println("not correct location"+location);
		return;
		  }
						
	 }
		static void initownerName(String OwnerName)
		{
			if(ownerName=="chandu")
		
		{	
		   Mall.ownerName=ownerName;
			System.out.println("ownerName:"+ownerName);
	
		}
	
		else
		{
			System.out.println("invalid ownerName"+ownerName);
			return;
		}
		}
	
		static void inittotalshop(int totalshop)
		{
		if(totalshop>0 && totalshop<=8)
		{
			Mall.totalshop=totalshop;
			System.out.println("totalshop:"+totalshop);
	        }
		else
		{
			System.out.println("invalid totalshop"+totalshop);
			return;
		}
		}
		static void initopen(String open)
		{
			if(open=="morning")
			{
				Mall.open=open;
			System.out.println("open:"+open);
			}
		else
		{
			System.out.println("not avilable"+open);
			return;
		}
		
	}
	static void init(String name,String location,String ownerName,int totalshop,String open)
	{
		initname(name);
		initlocation(location);
		initownerName(ownerName);
		inittotalshop(totalshop);
		initopen(open);
	}
}

