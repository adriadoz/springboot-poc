package hello.Services;

import org.springframework.stereotype.Component;

import hello.Domain.Greeting;
import hello.Domain.GreetingRepository;

@Component
public class FindGreetingService {
	
	    private GreetingRepository repository;
	    
	    FindGreetingService (GreetingRepository repository) {
	    	this.repository = repository;
	    }

	    public Greeting run(String name) {
	        return this.repository.findByName(name);
	    }
}