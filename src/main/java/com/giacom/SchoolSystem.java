package com.giacom;

import com.giacom.school.domain.Course;
import com.giacom.school.domain.Student;
import com.giacom.school.domain.Teacher;

import java.util.Date;

public class SchoolSystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("John Doe", new Date(), 1, "S12345");
        Student student2 = new Student("Jane Smith", new Date(), 2, "S67890");

        // Create teachers
        Teacher teacher1 = new Teacher("Mr. Johnson", new Date(), "Mathematics", "T98765");
        Teacher teacher2 = new Teacher("Mrs. Williams", new Date(), "English", "T54321");

        // Create courses
        Course mathCourse = new Course("Mathematics", teacher1);
        Course englishCourse = new Course("English", teacher2);

        // Enroll students in courses
        mathCourse.enrollStudent(student1);
        englishCourse.enrollStudent(student1);
        englishCourse.enrollStudent(student2);

        // Print student's courses
        System.out.println(student1.getName() + "'s courses:");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getName() + " (Taught by: " + course.getTeacher().getName() + ")");
        }

        // Print student's  2 courses
        System.out.println(student2.getName() + "'s courses:");
        for (Course course : student2.getCourses()) {
            System.out.println(course.getName() + " (Taught by: " + course.getTeacher().getName() + ")");
        }
    }
}