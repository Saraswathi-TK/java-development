class HotelRunner
{ 
 public static void main(String[] values)
 {
	 
	 //name;
	//String owner;
	//int since;
	
	
	 Hotel hotel=new Hotel();
	 hotel.name="gogul hotel";
	 hotel.owner="Gogul";
	 hotel.since=1997;
	 System.out.println(hotel.name);
	 System.out.println(hotel.owner);
	 System.out.println(hotel.since);
	  
	hotel.serveFood();
	 
	 hotel.deliverFood();
	 
	TajHotel hotel1=new TajHotel();
	
   hotel1.serveFood();
	
	hotel1.deliverFood();
 }
	
}
