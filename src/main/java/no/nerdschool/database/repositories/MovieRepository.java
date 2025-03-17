package no.nerdschool.database.repositories;

import no.nerdschool.database.entities.Movie;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    @NativeQuery("""
            select *
            from movies m
            where m.date between '1999-03-01' and '1999-03-31'
            and m.kind = 'movie'
            order by m.date desc
            """)
    List<Movie> findMovies();
}
