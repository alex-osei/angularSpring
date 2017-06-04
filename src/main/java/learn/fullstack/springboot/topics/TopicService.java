package learn.fullstack.springboot.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alexosei on 6/3/17.
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


   public List<Topic> getTopics() {
       List<Topic> topics = new ArrayList<>();
       topicRepository.findAll().forEach(topics::add);

       return topics;
   }

   public Topic getTopic(String id) {
       return topicRepository.findOne(id);
   }

   public void postTopic(Topic topic) {
       topicRepository.save(topic);
   }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
