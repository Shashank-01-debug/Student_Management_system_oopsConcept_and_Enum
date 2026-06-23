package studentManagementSystem;

public class Teacher extends Person {

	static int teacherCounter=0;
	private String address;
	private String employeeId;
	private String subjectTeach;
	private int yearsOfExperience;
	private int salary;
	private static final double BASE_SALARY = 30000;
	private static final double EXPERIENCE_BONUS = 2000;

	
	public Teacher(String name, int age, String contactNumber, String address,  String employeeId,
			String subjectTeach, int yearsOfExperience) {
		super(name, age, contactNumber, address);
		if (validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address)
				&& validateTeacherId(employeeId) && validateYearsOfExperience(yearsOfExperience)) {
		
		
		this.employeeId = employeeId;
		this.subjectTeach = subjectTeach;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salary;
		calculateSalary();
		teacherCounter++;
	}
	}
	
	public static int getTotalTeacherCount() {
		return teacherCounter;
	}
	
	
	private void calculateSalary() {
		salary = (int) (BASE_SALARY + (yearsOfExperience * EXPERIENCE_BONUS));
	}

	public boolean validateYearsOfExperience(int yearsOfExperience) {
		if (yearsOfExperience >= 0 && yearsOfExperience <= 30) {
			return true;

		} else {
			System.err.println("Invalid years of experience");
			return false;
		}
	}

	public boolean validateAge(int age) {

		if (age >= 21 && age <= 65) {
			return true;
		} else {
			System.err.println("Invalid teacher age");
			return false;
		}

	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid Contact Number");
			return false;
		}
	}

	public boolean validateAddress(String address) {
		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid teacher address");
			return false;

		}
	}

	public boolean validateTeacherId(String employeeId) {

		if (employeeId.matches("T\\d{3}")) {
			return true;
		} else {
			System.err.println("Invalid teacher Employee Id");
			return false;

		}

	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (validateAge(age)) {
			this.age = age;
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		if (validateTeacherId(employeeId)) {
			this.employeeId = employeeId;
		}
	}

	public String getSubjectTeach() {
		return subjectTeach;
	}

	public void setSubjectTeach(String subjectTeach) {
		this.subjectTeach = subjectTeach;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (validateYearsOfExperience(yearsOfExperience)) {
			this.yearsOfExperience = yearsOfExperience;
		}
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", employeeId=" + employeeId + ", subjectTeach=" + 
				subjectTeach + ", yearsOfExperience="
				+ yearsOfExperience + ", salary=" + salary + "]";
	}
	

	public void displayTeacherInfo() {
		System.out.println("--------------Teacher Info--------------");
		System.out.println("Teacher's Name:"+name);
		System.out.println("Teacher's contactNumber:"+contactNumber);
		System.out.println("Teacher's age:"+age);
		System.out.println("Teacher's address:"+address);
		System.out.println("Teacher's employeeId:"+employeeId);
		System.out.println("Teacher's subjectTeach:"+subjectTeach);
		System.out.println("Teacher's yearsOfExperience:"+yearsOfExperience);
		System.out.println("Teacher's salary:"+salary);
		System.out.println("-------------------------------------");

	}
	
	public boolean updateInformation(String newaddress, String newcontactNumber) {
		boolean hrApproval = getHRApproval();
		
		if(hrApproval) {
			if(super.updateInformation(newaddress, newcontactNumber)) {
				System.out.println("Notifying the teacher that address and contact number is updated... ");
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean updateInformation(String newaddress) {
		boolean hrApproval = getHRApproval();
		
		if(hrApproval) {
			if(super.updateInformation(newaddress)) {
				System.out.println("Notifying the teacher that address and contact number is updated... ");
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean updateInformation( String newcontactNumber,boolean update) {
		boolean hrApproval = getHRApproval();
		
		if(hrApproval) {
			if(super.updateInformation(newcontactNumber,update)) {
				System.out.println("Notifying the teacher that address and contact number is updated... ");
				return true;
			}
		}
		
		return false;
	}
	
	
	
	

	private boolean getHRApproval() {
		//dummy method
		return true;
	}
	
	

}
