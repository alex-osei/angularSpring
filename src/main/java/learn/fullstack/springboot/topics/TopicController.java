package learn.fullstack.springboot.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by alexosei on 6/3/17.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/api/topics")     // GET /topics
    public List<Topic> getTopics() {
        return topicService.getTopics();
    }

    @RequestMapping("/api/topics/{id}")   // GET  /topics/id
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/topics")    // POST /topics
    public void postTopic(@RequestBody Topic topic) {
        topicService.postTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/api/topics/{id}")     // PUT  /topics/id
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/topics/{id}")  // DELETE  /topics/id
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
