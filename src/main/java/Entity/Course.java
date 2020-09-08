package Entity;

public class Course {
	String name;
	long createdAt;
	
	Course(String name) {
		this.name = name;
		this.createdAt = System.currentTimeMillis();
	}
}
