package no.nerdschool.database;

import no.nerdschool.database.repositories.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    private final MovieRepository movieRepository;

    public MoviesController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public ModelAndView sayHello() {
        return new ModelAndView("movies")
                .addObject("movies", movieRepository.findMoviesWhereNameLike("star wars"));

    }
}
