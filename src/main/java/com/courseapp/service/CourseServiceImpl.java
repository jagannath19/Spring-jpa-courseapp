package com.courseapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapp.model.Course;
import com.courseapp.repository.ICourseRepository;


/**
 * @author JagannathSutar
 * This class methods are call the CourseDao class methods and handle exception if there
 */
@Service
public class CourseServiceImpl implements ICourseService {
	List<Course> courseList;
	
	private ICourseRepository courseRepository;
	@Autowired
	public void setCourseRepository(ICourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	@Override
	public Course getById(int courseId) {
		return courseRepository.findById(courseId).get();
	}

	@Override
	public void updateCourse(int courseId, double courseFee) {
		Course course=new Course(); //course == null
		course=courseRepository.findById(courseId).get(); // course = id,name.fees....
		course.setCourseFee(courseFee); // course = id, name, newFees....
		courseRepository.save(course);
	}

	@Override
	public void deleteCourse(int courseId) {
		courseRepository.deleteById(courseId);
	}

	@Override
	public List<Course> getAllCourse() {
		List<Course> courseList=courseRepository.findAll();
		return courseList;
	}

	@Override
	public List<Course> getByCategory(String Category) {
		courseList=courseRepository.findByCategory(Category);
		return courseList;
	}

	@Override
	public List<Course> getByCategoryAndLessFee(String category, double courseFees) {
		courseList=courseRepository.findByCategoryAndCourseFeeLessThanEqual(category, courseFees);
		return courseList;
	}

	@Override
	public List<Course> getByCategoryAndFaculty(String category, String facultyName) {
		courseList=courseRepository.findByCategoryAndFacultyName(category, facultyName);
		return courseList;
	}

	@Override
	public List<Course> getByNameContaining(String name) {
		// TODO Auto-generated method stub
//		findByNameLike
		courseList=courseRepository.findByCourseNameLike(name);
		
		return courseList;
	}

	@Override
	public List<Course> getByNameAndFaculty(String name, String faculty) {
		// TODO Auto-generated method stub
		// findByNameAndFacultyName
		return courseRepository.findByCourseNameAndFacultyName(name, faculty);
	}

}
