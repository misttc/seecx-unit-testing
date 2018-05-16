package edu.tum.cs.i1.seecx;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CourseTest {

	@Test
	public void testGetTitle() {
		String CourseName = "Software Engineering";
		Course aCourse = new Course(CourseName);
		
		assertEquals("Get Course Name Match",aCourse.getTitle(),CourseName);
	}

	@Test
	public void testGetNumberOfAttendeesWithNoAttendees() {

		String CourseName = "Data Mining";
		Course aCourse = new Course(CourseName);
		
		assertSame("No one enrolled yet",aCourse.getNumberOfAttendees(),0);		
	}

	@Test
	public void testGetNumberOfAttendeesWithTwoAttendees() {

		String CourseName = "Data Mining";
		
		Course aCourse = new Course(CourseName);
		List<Student> attendees = new ArrayList<Student>();
		
		Student s1, s2;
		
		s1 = new Student("Don","Trump","1950","MIS","MKT");
		s2 = new Student("Bill","Clinton","1954","LAW","MKT");
	
		attendees.add(s1);
		attendees.add(s2);
		aCourse.setAttendees(attendees);
		assertSame("Two enrolled",aCourse.getNumberOfAttendees(),2);				
	}

}