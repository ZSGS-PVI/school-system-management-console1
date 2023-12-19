package schoolbookpannel.dto;

public class Student {
	private String name;
	private String mobileno;
	private  String DOB;
	private String email;
	

	public Student(String name, String mobileno, String dOB, String email) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.DOB = dOB;
		this.email = email;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileno() {
		return mobileno;
	}


	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void onSuccess() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileno=" + mobileno + ", DOB=" + DOB + ", email=" + email + "]";
	}
	
	

}
