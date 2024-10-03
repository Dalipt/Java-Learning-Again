package com.java.CourseAssociation.main;

import com.java.CoursesAssociation.services.*;

public class Courses 
{
	private CourseInterface course;

	public void setCourse(CourseInterface course) 
	{
		this.course = course;
	}

	public Courses(CourseInterface course) {
		super();
		this.course = course;
	}
	public Boolean Courses1(Double amount)
	{
		return course.setCourseService(amount);
	}
	
}
