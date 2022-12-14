package com.courseapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author JagannathSutar
 *
 */
@Entity 
//@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(generator = "courseIdGenerator", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "courseIdGenerator", sequenceName = "sequenceGenerator", initialValue = 100, allocationSize = 10)
	private Integer courseId;
	private String courseName;
	private String facultyName;
	private String mode;
	private String category;
	private int durationInDays;
	private double courseFee;
	public Course() {
		super();
	}
	/**
	 * @param courseName
	 * @param facultyName
	 * @param mode
	 * @param category
	 * @param durationInDays
	 * @param courseFee
	 */
	public Course(String courseName, String facultyName, String mode, String category,
			int durationInDays, double courseFee) {
		super();
		this.courseName = courseName;
		this.facultyName = facultyName;
		this.mode = mode;
		this.category = category;
		this.durationInDays = durationInDays;
		this.courseFee = courseFee;
	}
	
	
	
	
	
	
	public Course(Integer courseId, String courseName, String facultyName, String mode, String category,
			int durationInDays, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.facultyName = facultyName;
		this.mode = mode;
		this.category = category;
		this.durationInDays = durationInDays;
		this.courseFee = courseFee;
	}
	/**
	 * @param courseName
	 * @param courseId
	 * @param facultyName
	 * @param mode
	 * @param category
	 * @param durationInDays
	 * @param courseFee
	 */
	public Course(String courseName, Integer courseId, String facultyName, String mode, String category,
			int durationInDays, double courseFee) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.facultyName = facultyName;
		this.mode = mode;
		this.category = category;
		this.durationInDays = durationInDays;
		this.courseFee = courseFee;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "OnlineCourse [courseName=" + courseName + ", courseId=" + courseId + ", facultyName=" + facultyName
				+ ", mode=" + mode + ", category=" + category + ", durationInDays=" + durationInDays + ", courseFee="
				+ courseFee + "]";
	}
	
	
		
	
}
