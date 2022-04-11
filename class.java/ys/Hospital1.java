class Hospital1
{
	String name;
	int noOfDoctors=20;
	int noOfBeds=30;
	int noOfSecurity=10;
	HospitalType HospitalType;
	HospitalSpecilization HospitalSpecilization;
	
	Hospital1()
	{
	       System.out.println(".......");	
	}
	
		Hospital1(String name)
	{
		this.name=name;
		System.out.println("hospital name");
	}
	Hospital1(String name,int noOfDoctors)
	{
		this(name);
		this.noOfDoctors=noOfDoctors;
		System.out.println("hospital doctors");
	}
	Hospital1(String name,int noOfDoctors,int noOfBeds)
	{
		this(name,noOfDoctors);
		this.noOfBeds=noOfBeds;
		System.out.println("hospita beds");
		
	}
	Hospital1(String name,int noOfDoctors,int noOfBeds,int noOfSecurity)
	{
		this(name,noOfDoctors,noOfBeds);
		this.noOfSecurity=noOfSecurity;
		System.out.println("hospita security");
	}
	
	Hospital1(String name,int noOfDoctors,int noOfBeds,int noOfSecurity,HospitalType HospitalType)
	{
		this(name,noOfBeds,noOfDoctors,noOfSecurity);
		this.HospitalType=HospitalType;
		System.out.println("hospita types");
	}
	
	Hospital1(String name,int noOfDoctors,int noOfBeds,int noOfSecurity,HospitalType HospitalType,HospitalSpecilization HospitalSpecilization)
    {
	this(name,noOfBeds,noOfDoctors,noOfSecurity,HospitalType);
	this.HospitalSpecilization=HospitalSpecilization;
	System.out.println("hospita specilization");
	}
	
}
