package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddGreeting {

	    private GreetingRepository repository;
	    
	    AddGreeting (GreetingRepository repository) {
	    	this.repository = repository;
	    }

	    @RequestMapping(value="/add-greeting", method=RequestMethod.POST)
	    public Greeting addGreeting(@RequestParam(value="name", defaultValue="Default") String name) {
	    	Greeting greeting = new Greeting(name);
	    	this.repository.save(greeting);
	        return greeting;
	    }
}
