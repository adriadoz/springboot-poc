package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hello.Domain.Greeting;
import hello.Domain.GreetingRepository;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Application{
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
	public CommandLineRunner demo(GreetingRepository repository) {
		return (args) -> {
			repository.save(new Greeting("Juanitu"));
			repository.save(new Greeting("Pepitu"));
			repository.save(new Greeting("Manola"));
		};
    }
    
}
