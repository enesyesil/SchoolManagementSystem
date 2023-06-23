package SchoolManagementSystem;

public class Student {
 
	
	private String name;
	private int age;
	private static int numOfStudents = 0;
	private int ID;
	
	public Student(String name , int age) {
		this.name = name;
		this.age = age;
		this.ID = Student.numOfStudents;
		numOfStudents++;
		
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
	
	public int getID() {
		return ID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
