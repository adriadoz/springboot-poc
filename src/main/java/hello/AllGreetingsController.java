package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllGreetingsController {

	    private Greeting greeting;
	    private GreetingRepository repository;
	    
	    AllGreetingsController (GreetingRepository repository) {
	    	this.repository = repository;
	    }

	    @RequestMapping("/allGreetings")
	    public Greeting allGreeting(@RequestParam(value="name", defaultValue="World") String name) {
	    	for (Greeting greeting : this.repository.findAll()) {
				this.greeting = greeting;
			}
	        return this.greeting;
	    }
}
