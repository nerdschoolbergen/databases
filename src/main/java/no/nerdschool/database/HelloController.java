package no.nerdschool.database;

import no.nerdschool.database.entities.Person;
import no.nerdschool.database.repositories.PersonRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("hello")
public class HelloController {
    private final PersonRepository personRepository;

    public HelloController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public ModelAndView sayHello() {
        return new ModelAndView("hello")
                .addObject("name", "Børre")
                .addObject("people", personRepository.findByName("John"));

    }
}
