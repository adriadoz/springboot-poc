package hello.Infrastructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hello.Domain.Greeting;
import hello.Services.AddGreetingService;

@RestController
public class AddGreetingController {

	    private AddGreetingService addGreeting;
	    
	    AddGreetingController (AddGreetingService addGreeting) {
	    	this.addGreeting = addGreeting;
	    }

	    @RequestMapping(value="/add-greeting", method=RequestMethod.POST)
	    public Greeting addGreeting(@RequestParam(value="name", defaultValue="Default") String name) {
	    	Greeting greeting = new Greeting(name);
	    	addGreeting.run(greeting);
	        return greeting;
	    }
}
