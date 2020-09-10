package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import Service.CourseService;
import Entity.Course;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

@RestController
@RequestMapping("/course")
public class RequestController {
	
	String courseName = "API";
	
	@Resource
	CourseService service = new CourseService(courseName);
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String sayHello() {
		return "<h1>Hello World</h1>";
	}
//	
//	public List<Course> getCourse(String courseName) {
//		return service.getCourse(courseName);
//	}	
//	
//	public List<Course> getCourse(Date courseDate) {
//		return service.getCourse(courseDate);
//	}
//
//	public List<Course> getCourse(long courseTime) {
//		return service.getCourse(courseTime);
//	}
}
