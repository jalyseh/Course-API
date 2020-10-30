package com.example.CourseAPI.topic.service;

import com.example.CourseAPI.topic.model.Topic;
import com.example.CourseAPI.topic.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("spring","Spring Framework","Spring Descrip."),
                new Topic("java","Java","Java Descrip."),
                new Topic("javascript","JavaScript","JavaScript Descrip.")
    ));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        //converting iterable to a list
        topicRepository.findAll().forEach(topics ::add);
        return topics;
    }

    public Topic getTopic(String id){
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
           topicRepository.deleteById(id);
    }
}
