package com.tcy.mvcdemo.service;

import org.springframework.stereotype.Service;

import com.tcy.mvcdemo.model.Course;

@Service
public interface CourseService {
	
	
	Course getCoursebyId(Integer courseId);	

}
