package studentManagementSystem;

public class Person {

    static int personCounter;//static variable
	protected String name;
	protected int age;
	protected String contactNumber;
	protected String address;
	
	
	public Person(String name, int age, String contactNumber, String address) {
		
		super();
		if(validateAddress(address) && validateMobileNumber(contactNumber)) {
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
		this.address = address;
		personCounter++;
	}
	}
	
	public static int getTotalPersonCount() {
		return personCounter;
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
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		if(validateMobileNumber(contactNumber)) {
		this.contactNumber = contactNumber;
		}
		}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if(validateAddress(address))
				{
		this.address = address;
		}
		}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", "
				+ "contactNumber=" + contactNumber + ", address=" + address
				+ "]";
	}
	
	private boolean validateMobileNumber(String contactNumber) {
		
		if(contactNumber.matches("\\d{10}")) {
			return true;
		}
		else {
			System.err.println("Invalid contact number");
			return false;
		}
		
	}
	
	private boolean validateAddress(String address) {
		if(address.isEmpty()) {
			System.err.println("Invalid Personal Address");
			return false;
		}
		else {
			return true;
		}
	}
	
	protected boolean updateInformation(String newAddress, String newContactNumber) {
		
		if(validateAddress(newAddress) && validateMobileNumber(newContactNumber)) {
			this.address=newAddress;
			this.contactNumber= newContactNumber;
			System.out.println("updated address and personal Info");
			return true;
		}
		else {
			return false;
		}
		
	}
	
protected boolean updateInformation(String newAddress) {
		
		if(validateAddress(newAddress) ) {
			this.address=newAddress;
			
			System.out.println("updated address ");
			return true;
		}
		else {
			return false;
		}
		
	}

protected boolean updateInformation(String newContactNumber,boolean update) {
	
	if( validateMobileNumber(newContactNumber)) {
		
		this.contactNumber= newContactNumber;
		System.out.println("updated Contact Number");
		return true;
	}
	else {
		return false;
	}
	
}
	
	
	
	
	
}
