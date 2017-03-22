package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! put your name in the path for a personal greeting!";
    }

    @RequestMapping("/{name}")
    public String name_inspector(@PathVariable("name") String name) {
        if (name.toLowerCase().trim().equals("micah")) {
            return "GO JUMP IN A LAKE";
        }
        return "Hello "+name+" how's it goin?";
    }
}

