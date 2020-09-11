package com.example.vorlesungsplan.Service;

import com.example.vorlesungsplan.Entity.Course;
import org.json.JSONException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class CourseService {

Course dhbw;

	public String getCourse(String courseName) throws JSONException {
		return "TEST";
//		return dhbw.getName();
	}
	
	public String getCourse(Date courseDate) {
		return dhbw.toString();
	}
	
	public String getCourse(long courseTime) {
		return dhbw.toString();
	}

}
