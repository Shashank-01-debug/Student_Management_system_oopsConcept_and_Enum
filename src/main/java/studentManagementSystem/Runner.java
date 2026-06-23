package studentManagementSystem;

public class Runner {

	public static void main(String[] args) 
	{
		
     //polymorphism
		//upcasting
	//	Person s1 = new Student("Messi",21,"8989278000","H-903 govindPuri",10,98,35,32);
		//Person s2 = new Student("Ronaldo",28,"8989278000","H-903 govindPuri",7,98,35,32);
		//downcasting
		((Student)s1).calculateTotalMarks();
		((Student)s1).calculatePercentage();
		((Student)s1).calculateGrade();
	    ((Student)s1).displayStudentInfo();
		
		s1.updateInformation("Pune", "3124419090");
	//	((Student)s1).displayStudentInfo();
		s1.updateInformation("Dubai");
	//	((Student)s1).displayStudentInfo();
		
		Person t1= new Teacher("Pep guardiola",28,"9129001234","H-12 govindpuri","T319","science",5);	
		//((Teacher)t1).displayTeacherInfo();
		((Teacher)t1).updateInformation("Washington", "3102721000");
		((Teacher)t1).displayTeacherInfo();
		
		((Teacher)t1).updateInformation( "9102221000",true);
		((Teacher)t1).displayTeacherInfo();
		
		System.out.println("Total Person joined today:"+Person.getTotalPersonCount());
		System.out.println("Total Students joined today:"+Student.getTotalStudentCount());
		System.out.println("Total Teachers joined today:"+Teacher.getTotalTeacherCount());

	}

}
