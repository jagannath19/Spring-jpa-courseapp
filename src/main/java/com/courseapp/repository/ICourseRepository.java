package com.courseapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseapp.model.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer>{
	List<Course> findByCategory(String category);
	List<Course> findByCategoryAndFacultyName(String category,String facultyName);
	List<Course> findByCourseNameLike(String courseName);
	List<Course> findByCourseNameAndFacultyName(String courseName,String facultyName);
	List<Course> findByCategoryAndCourseFeeLessThanEqual(String category,double courseFee);

}
