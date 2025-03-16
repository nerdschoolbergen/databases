package no.nerdschool.database.controllers;

import no.nerdschool.database.repositories.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/movies")
public class MoviesController {
    private final MovieRepository movieRepository;

    public MoviesController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public ModelAndView sayHello() {
        return new ModelAndView("movies/movie-list")
                .addObject("movies", movieRepository.findMoviesWhereNameLike("star wars"));

    }
}
