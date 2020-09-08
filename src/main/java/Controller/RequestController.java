package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Service.CourseService;
import Entity.Course;

import java.util.List;

import javax.annotation.Resource;

public class RequestController {
	@Resource
	CourseService service = new CourseService();
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public List<Course> getExampleData() {
		return service.getExampleData();
	}
}
