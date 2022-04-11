class Person
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
		Byte b1=new Byte(age);
		System.out.println("age :"+Byte.toString(b1));
		Byte b2=new Byte(age);
		System.out.println("age :"+Byte.toString(b1));
		

		

		System.out.println("\n busNo");
	    String busNo="401";
		short bus=Short.valueOf(busNo);
		System.out.println("busNo :"+busNo);
		short bus1=Short.decode(busNo);
		System.out.println("bus :"+bus1);
		short bus2=Short.parseShort(busNo);
		System.out.println("bus :"+bus2);
		Short s1=new Short(busNo);
		System.out.println("bus :"+Short.toString(s1));
		Short s2=new Short((short)401);
		System.out.println("bus :"+Short.toString(s2));
		
		
		
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
		String mobileNo="12345678";
		long mbl=Long.valueOf(mobileNo);
		System.out.println("mobileNo:"+mobileNo);
		long mbl1=Long.decode(mobileNo);
		System.out.println("mobileNo :"+mbl1);
		long mbl2=Long.parseLong(mobileNo);
		System.out.println("mobileNo :"+mbl2);
		long mbl3=Long.getLong(mobileNo,12345678);
		System.out.println("mobileNo :"+mbl3);
		long mbl4=Long.lowestOneBit(12345678);
		System.out.println("mobileNo :"+mbl4);
		
		System.out.println("\n cost");
		String cost="45.0";
		float cst=Float.valueOf(cost);
		System.out.println("cost:"+cost);
		float cst1=Float.parseFloat(cost);
		System.out.println("cst1:"+cst1);
		float cst2=Float.max(cst,cst1);
		System.out.println("cost :"+cst2);
		float cst3=Float.min(cst1,cst2);
		System.out.println("cost :"+cst3);
		float cst4=Float.sum(cst2,cst3);
		System.out.println("cost :"+cst4);
		
		System.out.println("\n price");
		String price="12000.00";
		double prs1=Double.valueOf(price);
		System.out.println("price :"+prs1);
		double prs2=Double.parseDouble(price);
		System.out.println("price :"+prs2);
		double prs3=Double.max(prs1,prs2);
		System.out.println("price :"+prs3);
		double prs4=Double.min(prs1,prs2);
		System.out.println("price :"+prs4);
		double prs5=Double.sum(prs1,prs2);
		System.out.println("price :"+prs5);
		
		System.out.println("\n boolean");
		String open="true";
		boolean opn=Boolean.valueOf(open);
		System.out.println("open: "+open);
		boolean opn1=Boolean.getBoolean(open);
		System.out.println("open :"+opn1);
		boolean opn2=Boolean.parseBoolean(open);
		System.out.println("open :"+opn2);
		boolean opn3=Boolean.logicalAnd(opn1,opn2);
		System.out.println("open :"+opn3);
		boolean opn4=Boolean.logicalXor(opn2,opn3);
		System.out.println("open :"+opn4);
		
		
		System.out.println("\n gender");
		String gender="f";
		char gen=gender.charAt(0);
		System.out.println("gender :"+gen);
		
		
		}
}