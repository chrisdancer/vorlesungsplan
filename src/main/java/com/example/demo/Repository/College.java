package com.example.demo.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Resource;
import Entity.Course;

public interface College {

    // @Resource
// Course on19 = null;
//
// Course[] courses = new Course[10];
//
// Course course1 = new Course("WEB-API");
//
// courses.add();
    public static void createJSONArray () {

        try {
            FileReader reader = new FileReader("../../../files/moodlecal19a.ical");
//Read JSON file

//Iterate over employee array

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }


}


