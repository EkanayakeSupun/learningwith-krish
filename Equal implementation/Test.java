class Test{
	public static void main(String args[]){
		Employee emp1=new Employee();
		emp1.setEmpId(01);
		emp1.setEmpCode(501012);
		emp1.setName("Saman");
		emp1.setNic("840785912v");
		emp1.setAddress("No 350, Piliyandala.");

		Employee emp2=new Employee();
		emp2.setEmpId(02);
		emp2.setEmpCode(501014);
		emp2.setName("Kapila");
		emp2.setNic("750988403v");
		emp2.setAddress("RD Mel Mawatha, Colombo5");

		System.out.println(emp1.equals(emp2));

		Employee emp3=new Employee();
		emp3.setEmpId(02);
		emp3.setEmpCode(501014);
		emp3.setName("Kapila");
		emp3.setNic("750988403v");
		emp3.setAddress("RD Mel Mawatha, Colombo5");
		
		System.out.println(emp2.equals(emp3));
	}
}