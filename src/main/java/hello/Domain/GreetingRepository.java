package hello.Domain;

import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greeting, Long> {
    Greeting findByName(String name);
}
