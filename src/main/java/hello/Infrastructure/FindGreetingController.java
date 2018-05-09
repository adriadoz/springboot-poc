package hello.Infrastructure;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hello.Services.FindGreetingService;


@Controller
public class FindGreetingController {

	    private FindGreetingService findGreeting;
	    
	    FindGreetingController (FindGreetingService findGreeting) {
	    	this.findGreeting = findGreeting;
	    }

	    @RequestMapping(value="/find-greeting", method=RequestMethod.GET)
	    public String findGreeting(Model model, @RequestParam(value="name") String name) {
	    	model.addAttribute("greetings", this.findGreeting.run(name));
	        return "all-greetings";
	    }
}