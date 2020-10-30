package com.example.CourseAPI.course.repository;

import com.example.CourseAPI.course.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);
}
