package no.nerdschool.database.repositories;

import no.nerdschool.database.entities.Movie;
import no.nerdschool.database.entities.Person;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    @NativeQuery("""
            select *
            from movies m
            where lower(m.name) like %:name%
            and m.kind = 'movie'
            order by m.date
            """)
    List<Movie> findMoviesWhereNameLike(@Param("name") String name );

    @NativeQuery("""
            select *
            from movies m
            order by m.runtime desc
            limit 10
            """)
    List<Movie> findLongestMovies();
}
