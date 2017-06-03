package learn.fullstack.springboot.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alexosei on 6/3/17.
 */
@Service
public class TopicService {

   private List<Topic> topics =  new ArrayList<>(Arrays.asList(
           new Topic("spring", "Spring", "Java Framework"),
           new Topic("angular", "Angular", "JavaScript Framework"),
           new Topic("django", "Django", "Python Framework"),
           new Topic("react", "React", "JavaScript Framework")
   ));

   public List<Topic> getTopics() {
       return topics;
   }

   public Topic getTopic(String id) {
       return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
   }

   public void postTopic(Topic topic) {
        topics.add(topic);
   }

    public void updateTopic(String id, Topic topic) {
       for(int i = 0; i < topics.size(); i++){
           Topic t = topics.get(i);
           if(t.getId().equals(id)) {
               topics.set(i, topic);
               return;
           }
       }
    }

    public void deleteTopic(String id) {
       topics.removeIf(topic -> topic.getId().equals(id));
    }
}
