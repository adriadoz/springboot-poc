package hello.Infrastructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hello.Domain.Greeting;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    
    private Greeting greeting;

    @RequestMapping("/greeting")
    String greeting(Model model, @RequestParam(value="name", defaultValue="World") String name) {
    	greeting = new Greeting(name);
        model.addAttribute("content", greeting.getContent());
        return "greeting";
    }
}