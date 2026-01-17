package assignment14thJan;

public class College {
	String clgName;
	public static void main(String[] args) {
		Students s1 = new Students("Saksham", "ECE", "IEM");
		s1.printAll();
		Department d1 = new Department("CSE", "UEM");
		d1.printAll();
		
	}
}

class Department extends College {
	String deptName;
	Department() {
		
	}
	Department(String deptName, String clgName){
		this.deptName = deptName;
		this.clgName = clgName;
	}
	public void printAll() {
		System.out.println("Department is called");
		System.out.println(deptName);
		System.out.println(clgName);
	}
}

class Students extends Department {
	String stdName;
	
	Students() {
		
	}
	
	Students(String stdName, String deptName, String clgName){
		this.stdName= stdName;
		this.deptName = deptName;
		this.clgName = clgName;
	}
	
	public void printAll() {
		System.out.println("Student is called");
		System.out.println(stdName);
		System.out.println(deptName);
		System.out.println(clgName);
	}
}
