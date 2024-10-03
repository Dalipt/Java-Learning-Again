package com.java.CoursesAssociation.services.Classes;

import com.java.CoursesAssociation.services.CourseInterface;

public class Java implements CourseInterface {

	public Boolean setCourseService(Double amount)
	{
		System.out.println("The amount for Java course Paid is "+ amount);
		return true;
	}

}
