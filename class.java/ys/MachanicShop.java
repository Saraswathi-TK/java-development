class MachanicShop
{
	public static void main(String[] items)
	{
		String age="73";
		byte ag=Byte.valueOf(age);
		System.out.println("age:"+age);
		byte ag1=Byte.decode(age);
		System.out.println("age :"+ag1);
		byte ag2=Byte.parseByte(age);
		System.out.println("age :"+ag2);

		System.out.println("\n busNo");
	    String busNo="401";
		short bus=Short.valueOf(busNo);
		System.out.println("busNo :"+busNo);
		short bus1=Short.decode(busNo);
		System.out.println("bus :"+bus1);
		short bus2=Short.parseShort(busNo);
		System.out.println("bus :"+bus2);
		
		System.out.println("\n sequnce");
		String sequnce="45000";
		int seq=Integer.valueOf(sequnce);
		System.out.println("sequnce:"+sequnce);
		int seq1=Integer.decode(sequnce);
		System.out.println("sequnce :"+seq1);
		int seq2=Integer.parseInt(sequnce);
		System.out.println("sequnce :"+seq2);
		int seq3=Integer.getInteger(sequnce,45000);
		System.out.println("sequnce:"+seq3);
		int seq4=Integer.lowestOneBit(45000);
		System.out.println("sequnce :"+seq4);

		System.out.println("\n mobileNo");
		String mobileNo="9986667354";
		long mbl=Long.valueOf(mobileNo);
		System.out.println("mobileNo:"+mobileNo);
		long mbl1=Long.decode(mobileNo);
		System.out.println("mobileNo :"+mobileNo);
		long mbl2=Long.parseLong(mobileNo);
		System.out.println("mobileNo :"+mobileNo);
		long mbl3=Long.getLong(mobileNo,7);
		System.out.println("mobileNo :"+mobileNo);
		long mbl4=Long.lowestOneBit(73);
		System.out.println("mobileNo :"+mobileNo);
		
		System.out.println("\n cost");
		String cost="45.0";
		float cst=Float.valueOf(cost);
		System.out.println("cost:"+cost);
		float cst1=Float.parseFloat(cost);
		System.out.println("cst1:"+cst1);
		
		System.out.println("\n price");
		String price="12000.00";
		double prs=Double.valueOf(price);
		System.out.println("price :"+price);
		double prs2=Double.parseDouble(price);
		System.out.println("price :"+price);
		
		System.out.println("\n boolean");
		String open="true";
		boolean opn=Boolean.valueOf(open);
		System.out.println("open: "+open);
		boolean opn1=Boolean.getBoolean(open);
		System.out.println("open :"+open);
		boolean opn2=Boolean.parseBoolean(open);
		System.out.println("open :"+open);
		
		System.out.println("\n gender");
		String gender="f";
		System.out.println("gender :"+gender);
		
		
		}
}