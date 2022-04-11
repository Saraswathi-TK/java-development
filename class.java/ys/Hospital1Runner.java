class Hospital1Runner
{
	public static void main(String[] args)
	{
		Hospital1 hospital=new Hospital1();
		hospital=new Hospital1("saru",3,4,5,HospitalType.TEACHING,HospitalSpecilization.ORTHOPEDICS);
		
		System.out.println(hospital.name);
		System.out.println(hospital.noOfDoctors);
		System.out.println(hospital.noOfBeds);
		System.out.println(hospital.noOfSecurity);
		System.out.println(hospital.HospitalSpecilization);
		System.out.println(hospital.HospitalType);
		
	}
}