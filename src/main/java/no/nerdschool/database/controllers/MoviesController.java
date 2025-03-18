package no.nerdschool.database.controllers;

import no.nerdschool.database.entities.Movie;
import no.nerdschool.database.repositories.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ModelAndView list() {
        return new ModelAndView("movies/movie-list")
                .addObject("movies", movieRepository.findMovies());
    }

    @GetMapping("{id}")
    public ModelAndView show(@PathVariable Long id) {

        //TODO: Replace this with a movie you've looked up from the database
        Movie movie = new Movie();
        movie.setName("Placeholder Movie");
        movie.setId(42L);

        return new ModelAndView("movies/movie")
                .addObject("movie", movie);
    }
}
