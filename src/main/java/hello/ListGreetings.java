package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ListGreetings {

		private Iterable<Greeting> allGreeting;
	    private GreetingRepository repository;
	    
	    ListGreetings (GreetingRepository repository) {
	    	this.repository = repository;
	    }

	    @RequestMapping(value="/list-greetings")
	    public String allGreeting(Model model, @RequestParam(value="name", defaultValue="World") String name) {
	    	this.allGreeting = this.repository.findAll();
	    	model.addAttribute("greetings", this.allGreeting);
	        return "all-greetings";
	    }
}