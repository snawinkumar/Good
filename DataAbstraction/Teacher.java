package DataAbstraction;

public class Teacher implements Employee{
	String name;
	public String showSalary(int salary) {
		return "Staff Salary is "+salary;
	}
	public String showDepartment(String department) {
		return "Departmeent is "+department;
	}
	public String showWorkingSector(String sector) {
		return "Sector is "+sector;
	}

}
