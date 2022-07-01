package DataAbstraction;

public class OnlineCourse  implements Course {
	String studentName;
	public String showCourseId(int id) {
		return "Course Id is: "+id;
	}
	public String showCourseFees(String courseName) {
		String fees=" ";
		if(courseName.equalsIgnoreCase("Java")) {
			fees=fees+"java is 5000";
		}
		else if(courseName.equalsIgnoreCase("python")) {
			fees=fees.concat("python fees is 8000");
		}
		else if(courseName.equalsIgnoreCase("C++")) {
			fees=fees.concat("python fees is 3000");
		}
		return fees;
	}

}
