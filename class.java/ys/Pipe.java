class Pipe
{
	static int length;
	static double diameter;
	static String color;
	static String material;
	 
	
	
	static void initLength(int length)
	{
		if(length>0 && length<=20)
		{
     Pipe.length=length;
	System.out.println("Pipe.length"+Pipe.length);
		}
		else
		{
			System.out.println("invalid Length"+length);
		}
	
	}
	static void initDiameter(double diameter)
	{
		
			if(diameter>0 && diameter<12)
			{
		Pipe.diameter=diameter;
		System.out.println(" Pipe.Diameter"+Pipe.diameter);
			}
			else
			{
				System.out.println("inavlid Diameter"+diameter);	
			}
	}
	static void initColor(String color)
	{
		if(color !=null && color=="red")
		{
		Pipe.color=color;
		System.out.println(" Pipe.color"+Pipe.color);
		}
		else
		{
			System.out.println("invalid color"+color);
		}
	}
	static void initMaterial(String material)
	{
		if(material !=null && material=="fiber")
		{
		Pipe.material=material;
		System.out.println("Pipe.material"+material);
		}
		else
		{
			System.out.println("invalid Material"+material);
		}
	}
	static void init(int length,double diameter,String color,String material)
	{
		initLength(length);
		initDiameter(diameter);
		initColor(color);
		initMaterial(material);
		
	}
	}