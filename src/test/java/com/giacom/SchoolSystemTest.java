package com.giacom;

import com.giacom.school.domain.Contact;
import com.giacom.school.domain.Course;
import com.giacom.school.domain.Student;
import com.giacom.school.domain.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

class SchoolSystemTest {
    private Student student;
    private Teacher teacher;
    private Course course;

    @BeforeEach
    public void setup() {
        // Create a student
        student = new Student("John Doe", new Date(), 1, "S12345");
        Contact contact = new Contact("aaa@aaa.com", "11123323");
        student.setContact(List.of(contact));

        // Create a teacher
        teacher = new Teacher("Mr. Johnson", new Date(), "Mathematics", "T98765");

        // Create a course
        course = new Course("Mathematics", teacher);
    }

    @Test
    public void testEnrollStudentInCourse() {
        // Enroll student in course
        course.enrollStudent(student);

        // Verify that student is enrolled in the course
        Assertions.assertTrue(course.getStudents().contains(student));
        Assertions.assertTrue(student.getCourses().contains(course));
    }


}