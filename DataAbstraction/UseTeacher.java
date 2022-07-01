package DataAbstraction;

public class UseTeacher {
	public static void main(String[] args) {
	Teacher teach=new Teacher();
	teach.name="Vijay";
	System.out.println("Staff Name : "+teach.name );
	System.out.println(teach.showDepartment("Science"));
	System.out.println(teach.showWorkingSector("Physics"));
	System.out.println(teach.showSalary(50000));
	
	}
}
