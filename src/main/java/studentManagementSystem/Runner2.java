package studentManagementSystem;
import static studentManagementSystem.Student.*;

public class Runner2 {

	public static void main(String[] args) {
		Student s1 = new Student.StudentBuilder("Mike", 27, "Mumbai", "2029128812").withRollNumber(21)
				.withmarksObtainedInEnglish(28).withmarksObtainedInScience(89).withmarksObtainedInMaths(93).build();

		s1.displayStudentInfo();
		System.out.println(demo);
	}

}
