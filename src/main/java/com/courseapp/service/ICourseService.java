package com.courseapp.service;
import com.courseapp.model.*;

import java.util.List;

/**
 * @author JagannathSutar
 *
 */
public interface ICourseService {
	
	void addCourse(Course course);
	Course getById(int courseId);
	void updateCourse(int courseId,double courseFee);
	void deleteCourse(int courseId);
	List<Course> getAllCourse();
	
	
	List<Course> getByCategory(String Category);
	
	List<Course> getByCategoryAndLessFee(String category,double courseFees);
	List<Course> getByCategoryAndFaculty(String category,String facultyName);
	List<Course> getByNameContaining(String name);
	List<Course> getByNameAndFaculty(String name,String faculty);
	
}
