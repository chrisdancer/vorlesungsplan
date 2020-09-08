package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import Service.CourseService;
import Entity.Course;
import java.util.List;
import javax.annotation.Resource;

public class RequestController {
	
	String courseName = "API";
	
	@Resource
	CourseService service = new CourseService(courseName);
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public List<Course> getCourse(String courseName) {
		return service.getCourse(courseName);
	}
}
