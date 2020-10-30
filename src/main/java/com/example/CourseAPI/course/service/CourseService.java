package com.example.CourseAPI.course.service;

import com.example.CourseAPI.course.model.Course;
import com.example.CourseAPI.course.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        //converting iterable to a list
        courseRepository.findByTopicId(topicId)
                .forEach(courses ::add);
        return courses;
    }

    public Course getCourse(String id){
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}

