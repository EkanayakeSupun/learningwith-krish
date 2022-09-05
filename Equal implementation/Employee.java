class Employee{
	private int empID,empCode;
	private String name,nic,address;

	public Employee(){}

	public Employee(int empID,int empCode,String name,String nic,String address){
		this.empID=empID;
		this.empCode=empCode;
		this.name=name;
		this.nic=nic;
		this.address=address;
	}

	public void setEmpId(int empID){
		this.empID=empID;
	}

	public int getEmpId(){
		return this.empID;
	}

	public void setEmpCode(int empCode){
		this.empCode=empCode;
	}

	public int getEmpCode(){
		return this.empCode;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

	public void setNic(String nic){
		this.nic=nic;
	}

	public String getNic(){
		return this.nic=nic;
	}

	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return this.address;
	}
	
	
	public boolean equals(Object obj){
		Employee newEmployee=(Employee) obj;
		return this.getEmpId()==newEmployee.getEmpId() && this.getEmpCode()==newEmployee.getEmpCode();
	}
}
