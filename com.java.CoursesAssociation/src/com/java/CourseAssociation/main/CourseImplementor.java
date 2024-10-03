package com.java.CourseAssociation.main;

import com.java.CoursesAssociation.services.Classes.*;

public class CourseImplementor {

	public static void main(String[] args) 
	{

		Courses cr = new Courses(new Java());
		DevOps dp = new DevOps();
		//dp.setCourseService(666.00);
		Boolean course= dp.setCourseService(6665.00);
		//Boolean course=cr.Courses1(5555.00);
		if(course)
		{
			System.out.println("Course purchased successfully");
		}
		else
		{
			System.out.println("Not opted for any course");
		}
	}

}
