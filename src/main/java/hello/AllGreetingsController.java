package hello;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class AllGreetingsController {

	    private Iterable<Greeting> allGreeting;
	    private GreetingRepository repository;
	    
	    AllGreetingsController (GreetingRepository repository) {
	    	this.repository = repository;
	    }

	    @RequestMapping("/all-greetings")
	    String allGreeting(Model model, @RequestParam(value="name", defaultValue="World") String name) {
	    	this.allGreeting = this.repository.findAll();
	    	model.addAttribute("greetings", this.allGreeting);
	        return "all-greetings";
	    }
}
