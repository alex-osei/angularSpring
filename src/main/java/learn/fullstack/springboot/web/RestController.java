package learn.fullstack.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexosei on 6/1/17.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/api/hello")
    public String greet() {
        return "Hey Spring!!!";
    }
}
