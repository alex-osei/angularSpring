package learn.fullstack.springboot.topics;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by alexosei on 6/3/17.
 */
public interface TopicRepository extends CrudRepository<Topic, String> {

}
