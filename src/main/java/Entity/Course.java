package Entity;

import java.util.Date;

public class Course {
	String name; //summary
	Date courseDate;
	long courseTime;
	String nameDozent; //description
	String room; //location
	long createdAt;
	
	Course(String name) {
		this.name = name;
		this.createdAt = System.currentTimeMillis();
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", createdAt=" + createdAt + "]";
	}
	
	
}
