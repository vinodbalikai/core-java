class Patient {

	private String patientName;
	private int age;
	private String disease;
	private double weight;
	private String doctorName;
	private int roomNumber;
	private String status;

	public void setPatientName(String patientName){
		this.patientName = patientName;
	}
	public String getPatientName(){
		return this.patientName;
	}

	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}

	public void setDoctorName(String doctorName){
		this.doctorName = doctorName;
	}
	public String getDoctorName(){
		return this.doctorName;
	}

	public void setDisease(String disease){
		this.disease = disease;
	}
	public String getDisease(){
		return this.disease;
	}

	public void setRoomNumber(int roomNumber){
		this.roomNumber = roomNumber;
	}
	public int getRoomNumber(){
		return this.roomNumber;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return this.weight;
	}

	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}

}