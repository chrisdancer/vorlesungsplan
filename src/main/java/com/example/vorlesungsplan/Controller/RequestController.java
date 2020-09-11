package com.example.vorlesungsplan.Controller;

import com.example.vorlesungsplan.Entity.Course;
import com.example.vorlesungsplan.Service.CourseService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/course")
public class RequestController {
	@Resource
	CourseService service;
	String courseNameTest = "API";

	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String getCourse(String courseName) throws JSONException {
		return service.getCourse(courseName);
	}

//	@RequestMapping(value = "/data", method = RequestMethod.GET)
//	public String getCourse(Date courseDate) {
//		return service.getCourse(courseDate);
//	}
//
//	@RequestMapping(value = "/data", method = RequestMethod.GET)
//		public String getCourse(long courseTime) {
//		return service.getCourse(courseTime);
//	}

	@RequestMapping(value = "/data", method = RequestMethod.POST)
	public String addCourse(@RequestParam String courseName_p, @RequestParam String nameDozent_p) throws JSONException {
		JSONObject newCourse = new JSONObject();
		newCourse.put("courseName", courseName_p);
		newCourse.put("nameDozent", nameDozent_p);
		return "<h1>" + newCourse.get("courseName") + "</h1>";
	}
}
