package hello.Services;

import org.springframework.stereotype.Component;

import hello.Domain.Greeting;
import hello.Domain.GreetingRepository;

@Component
public class AddGreetingService {

	    private GreetingRepository repository;
	    
	    AddGreetingService (GreetingRepository repository) {
	    	this.repository = repository;
	    }

	    public void run(Greeting greeting) {
	    	this.repository.save(greeting);
	    }
}
