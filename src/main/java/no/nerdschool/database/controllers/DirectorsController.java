package no.nerdschool.database.controllers;

import no.nerdschool.database.entities.Person;
import no.nerdschool.database.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/directors")
public class DirectorsController {


    private final PersonRepository personRepository;

    public DirectorsController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public ModelAndView list() {
        return new ModelAndView("/directors/director-list")
                .addObject("directors", personRepository.findAllDirectors());
    }

    @GetMapping("{id}")
    public ModelAndView show(@PathVariable Long id) {
        Person director = personRepository.findById(id).get();

        return new ModelAndView("/directors/director")
                .addObject("director", director);
    }
}
