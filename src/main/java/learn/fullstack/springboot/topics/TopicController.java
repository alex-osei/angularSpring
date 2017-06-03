package learn.fullstack.springboot.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alexosei on 6/3/17.
 */
@RestController
public class TopicController {

    @RequestMapping("/api/topics")
    public String getAllTopics() {
        return "All Topics";
    }
}
