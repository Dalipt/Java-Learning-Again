package com.java.CoursesAssociation.services.Classes;

import com.java.CoursesAssociation.services.CourseInterface;

public class DevOps implements CourseInterface {

		public Boolean setCourseService(Double amount)
		{
			System.out.println("The amount for DevOps course Paid is "+ amount);
			return true;
		}
}
