package Service;

import java.util.List;

import Entity.Course;
import Repository.College;

public class CourseService {
	College exampleRepository = new College();
	public List<Course> getExampleData() {
		return exampleRepository.findAll();
	}
}
