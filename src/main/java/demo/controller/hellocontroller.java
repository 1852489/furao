package demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @Autowired
    private usermapper mapper;
    @RequestMapping("/hello")

    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/demo")
    public String demo() {
        return "This is Springboot Demo!";
    }


}
