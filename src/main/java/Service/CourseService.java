package Service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import Entity.Course;
import Repository.College;

@Service
public class CourseService {
	
	public CourseService (String name) {
		
	}
	
	@Resource
	College dhbw;

	public List<Course> getCourse(String courseName) {
		return dhbw.findAll();
	}
	
	public List<Course> getCourse(Date courseDate) {
		return dhbw.findAll();
	}
	
	public List<Course> getCourse(long courseTime) {
		return dhbw.findAll();
	}

}
