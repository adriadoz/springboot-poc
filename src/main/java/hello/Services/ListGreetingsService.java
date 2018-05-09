package hello.Services;

import org.springframework.stereotype.Component;

import hello.Domain.Greeting;
import hello.Domain.GreetingRepository;

@Component
public class ListGreetingsService {
	
	    private GreetingRepository repository;
	    
	    ListGreetingsService (GreetingRepository repository) {
	    	this.repository = repository;
	    }

	    public Iterable<Greeting> run() {
	        return this.repository.findAll();
	    }
}