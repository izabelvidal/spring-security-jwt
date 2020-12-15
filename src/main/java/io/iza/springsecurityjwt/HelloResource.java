package io.iza.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloResource {
    
    @RequestMapping({"/hello"})
    public String hello() {
        return "hello world!";
    }
    
}
