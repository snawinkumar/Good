package DataAbstraction;

public class UseOnlineCourse {
	public static void main(String[] args) {
		OnlineCourse course=new OnlineCourse();
		course.studentName="kumar";
		System.out.println("StudentName is:"+course.studentName);
		System.out.println(course.showCourseId(9777));
		System.out.println(course.showCourseFees("javA"));
		
	}
	

}
