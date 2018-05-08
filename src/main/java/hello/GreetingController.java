package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private static final String template = "Hello, %s!";
    private Greeting greeting;

    @RequestMapping("/greeting")
    String greeting(Model model, @RequestParam(value="name", defaultValue="World") String name) {
    	greeting = new Greeting(String.format(template, name));
        model.addAttribute("content", greeting.getContent());
        return "greeting";
    }
}