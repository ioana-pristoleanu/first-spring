package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController: it's ready for use by Spring MVC to handle web requests. 
//combines @Controller and @ResponseBody, two annotations that results in 
    // web requests returning data rather than a view.
@RestController
public class HelloController {

    @RequestMapping("/") //maps "/" to the index() method; the method returns pure text
    public String index() {
        return "Greetings from Spring Boot!";
    }

}