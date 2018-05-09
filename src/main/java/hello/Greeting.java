package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private static final String template = "Hello, %s!";

    protected Greeting () {}

    public Greeting(String name) {
        this.name = name;
    }

    public String getContent() {
        return String.format(template, name);
    }
}