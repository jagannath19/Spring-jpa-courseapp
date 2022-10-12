package com.courseapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.courseapp.model.Course;
import com.courseapp.service.ICourseService;

@SpringBootApplication
public class SpringCourseappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCourseappApplication.class, args);
	}
	private ICourseService courseService;
	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
//		Course course1=new Course(100,"Spring", "Sripriya", "Online", "Database", 12, 1200);
//		Course course2=new Course(101, "python", "asutosh", "Offline", "language", 30, 8000);
//		Course course3=new Course(102, "MongoDB", "madhu", "Online", "Database", 20, 9000);
//		Course course4=new Course(103, "java", "durga", "Online", "Language", 45, 7000);
//		courseService.addCourse(course1);
//		courseService.addCourse(course2);
//		courseService.addCourse(course3);
//		courseService.addCourse(course4);
		courseService.getAllCourse().forEach(System.out::println);
		System.out.println("-----------");
		courseService.getByCategory("Database").forEach(System.out::println);
		System.out.println("-------------");
		courseService.getByCategoryAndFaculty("language", "asutosh").forEach(System.out::println);
		System.out.println("---------------------");
		courseService.getByCategoryAndLessFee("Database", 2000).forEach(System.out::println);
		System.out.println("----------------------------");
		courseService.getByNameAndFaculty("java", "durga").forEach(System.out::println);
		System.out.println("---------------------------------");
		courseService.getByNameContaining("python").forEach(System.out::println);
	}

}
