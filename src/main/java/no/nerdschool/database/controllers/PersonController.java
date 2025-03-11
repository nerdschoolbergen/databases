package no.nerdschool.database.controllers;

import no.nerdschool.database.entities.Person;
import no.nerdschool.database.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/person")
public class PersonController {


    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("{id}")
    public ModelAndView show(@PathVariable Long id) {
        Person person = personRepository.findById(id).get();

        return new ModelAndView("person")
                .addObject("person", person);
    }
}
