package com.example.CourseAPI.topic.repository;

import com.example.CourseAPI.topic.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

    //getAllTopics
    //getTopicById(String id)
    //updateTopic(Topic t)
    //deleteTopic(String id)
}
