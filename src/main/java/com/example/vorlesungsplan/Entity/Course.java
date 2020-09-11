package com.example.vorlesungsplan.Entity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileReader;
import java.util.Date;

public class Course {
	String name; //summary
	Date courseDate;
	long courseTime;
	String nameDozent; //description
	String room; //location
	long createdAt;
	
	Course(String name) throws JSONException {
		this.name = name;
		this.createdAt = System.currentTimeMillis();
	}

	JSONObject obj = new JSONObject("{" +
			"'course' : [" +
				"{'courseName' : 'T3: Web-IT Vorlesung'}, " +
				"{'nameDozent' : 'Mester'}" +
			"]" +
			"}");

	@Override
	public String toString() {
		return "Course [name=" + name + ", createdAt=" + createdAt + "]";
	}

	public String getName() throws JSONException {
		return (String) obj.get("course");
	}
}
