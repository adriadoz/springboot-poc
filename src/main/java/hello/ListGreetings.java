package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListGreetings {

	    private GreetingRepository repository;
	    
	    ListGreetings (GreetingRepository repository) {
	    	this.repository = repository;
	    }

	    @RequestMapping(value="/list-greetings")
	    public Iterable<Greeting> allGreeting(@RequestParam(value="name", defaultValue="World") String name) {
	    	
	        return this.repository.findAll();
	    }
}
