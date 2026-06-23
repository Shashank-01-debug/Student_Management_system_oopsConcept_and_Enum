package studentManagementSystem;

import java.util.Objects;

public class Student extends Person {

	static  int studentCounter = 0;
	private  int rollNo;
	private  int marksObtainedInScience;
	private  int marksObtainedInMaths;
	private  int marksObtainedInEnglish;
	private  final double totalMarks;
	private  final double percentage;
	private final String grade;
	static int demo=10;

	/*
	 * public Student(String name, int age, String contactNumber, String address,
	 * int rollNo, int marksObtainedInScience, int marksObtainedInMaths, int
	 * marksObtainedInEnglish) { super(name, age, contactNumber, address);
	 * 
	 * if (validateAddress(address) && validateContactNumber(contactNumber)) {
	 * 
	 * this.rollNo = rollNo; this.marksObtainedInScience = marksObtainedInScience;
	 * this.marksObtainedInMaths = marksObtainedInMaths; this.marksObtainedInEnglish
	 * = marksObtainedInEnglish; studentCounter++;
	 * 
	 * }
	 * 
	 * }
	 */

	public Student(StudentBuilder studentBuilder) {
		// to access static variable of parent class.
		super(studentBuilder.name, studentBuilder.age, studentBuilder.address, studentBuilder.contactNumber);
		this.rollNo = studentBuilder.rollNo;
		this.marksObtainedInScience = studentBuilder.marksObtainedInScience;
		this.marksObtainedInMaths = studentBuilder.marksObtainedInMaths;
		this.marksObtainedInEnglish = studentBuilder.marksObtainedInEnglish;
		totalMarks = calculateTotalMarks();
		percentage=calculatePercentage();
		grade=calculateGrade();
		studentCounter++;

	}

	public static int getTotalStudentCount() {
		return studentCounter;
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
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(int marksObtainedInScience) {
		this.marksObtainedInScience = marksObtainedInScience;
		
	}

	public int getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(int marksObtainedInMaths) {
		this.marksObtainedInMaths = marksObtainedInMaths;
	}

	public int getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(int marksObtainedInEnglish) {
		this.marksObtainedInEnglish = marksObtainedInEnglish;
	}

	public String getGrade() {
		return grade;
	}

	public double calculateTotalMarks() {
		double totalMarks = marksObtainedInScience + marksObtainedInMaths + marksObtainedInEnglish;
		return totalMarks;

	}

	public double calculatePercentage() {
	double	percentage = totalMarks / 3;
	return percentage;
		
	}

	public String calculateGrade() {

		String grade;
		if (percentage == 0) {
			grade = "Cannot be calculated";
		}

		else {
			grade = GradePolicy.calculateGrade(percentage);
		}
		
		return grade;

	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
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

	public boolean validateAddress(String address) {

		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.print("Address cannot be empty");
			return false;
		}

	}

	public boolean validateContactNumber(String contactNumber) {

		if (contactNumber.length() == 10) {
			return true;
		} else {
			System.err.print("Invalid contact number");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNo=" + rollNo + ", marksObtainedInScience="
				+ marksObtainedInScience + ", marksObtainedInMaths=" + marksObtainedInMaths
				+ ", marksObtainedInEnglish=" + marksObtainedInEnglish + ", totalMarks=" + totalMarks + ", percentage="
				+ percentage + ", grade=" + grade + ", contactNumber=" + contactNumber + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, marksObtainedInEnglish, marksObtainedInMaths, marksObtainedInScience, name,
				percentage, rollNo, totalMarks);
	}

	public void displayStudentInfo() {
		System.out.println("---------------Student Info---------------");
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Roll_No: " + "" + rollNo);
		System.out.println("marksObtainedInScience:" + marksObtainedInScience);
		System.out.println("marksObtainedInMaths:" + marksObtainedInMaths);
		System.out.println("marksObtainedInEnglish:" + marksObtainedInEnglish);
		System.out.println("total Marks Obtained:" + totalMarks);
		System.out.println("percentage:" + percentage);
		System.out.println("contact Number:" + contactNumber);
		System.out.println("Address:" + address);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(grade, other.grade)
				&& marksObtainedInEnglish == other.marksObtainedInEnglish
				&& marksObtainedInMaths == other.marksObtainedInMaths
				&& marksObtainedInScience == other.marksObtainedInScience && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNo == other.rollNo
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}

	public boolean updateInformation(String newAddress, String newContactNumber) {
		System.out.println("Requesting parent approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {

			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notifying the parent");
				return true;

			}

			else {
				System.err.println("No Approval from parent...");
				return false;
			}
		}
		return false;

	}

	public boolean updateInformation(String newAddress) {
		System.out.println("Requesting parent approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {

			if (super.updateInformation(newAddress)) {
				System.out.println("Notifying the parent");
				return true;

			}

			else {
				System.err.println("No Approval from parent...");
				return false;
			}
		}
		return false;

	}

	public boolean updateInformation(String newContactNumber, boolean update) {
		System.out.println("Requesting parent approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {

			if (super.updateInformation(newContactNumber, update)) {
				System.out.println("Notifying the parent");
				return true;

			}

			else {
				System.err.println("No Approval from parent...");
				return false;
			}
		}
		return false;

	}

	private boolean parentApproval() {
		return true;
	}

	public static class StudentBuilder {
		// mandatory
		private String name;
		private int age;
		private String contactNumber;
		private String address;
		// optional
		private int rollNo;
		private int marksObtainedInScience;
		private int marksObtainedInMaths;
		private int marksObtainedInEnglish;

		// create mandatory fields constructor
		public StudentBuilder(String name, int age, String contactNumber, String address) {

			if (validateContactNumber(contactNumber)&& validateAddress(address)) {

				this.name = name;
				this.age = age;
				this.contactNumber = contactNumber;
				this.address = address;
			}
		}

		public StudentBuilder withRollNumber(int rollNo) {
			this.rollNo = rollNo;
			return this;
		}

		public StudentBuilder withmarksObtainedInScience(int marksObtainedInScience) {
			this.marksObtainedInScience = marksObtainedInScience;
			return this;
		}

		public StudentBuilder withmarksObtainedInMaths(int marksObtainedInMaths) {
			this.marksObtainedInMaths = marksObtainedInMaths;
			return this;
		}

		public StudentBuilder withmarksObtainedInEnglish(int marksObtainedInEnglish) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			return this;
		}

		public boolean validateAddress(String address) {
                 
			return true;
		}
		

		public boolean validateContactNumber(String contactNumber) {

			if (contactNumber.length() == 10) {
				return true;
			} else {
				System.err.print("Invalid contact number");
				return false;
			}
		}

		public Student build() {
			Student student = new Student(this);
			return student;
		}

	}

}
