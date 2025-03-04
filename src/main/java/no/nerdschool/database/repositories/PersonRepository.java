package no.nerdschool.database.repositories;

import no.nerdschool.database.entities.Person;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long > {


    @NativeQuery("""
            select *
            from people p
            where p.name like :name%
            """)
    List<Person> findByName(@Param("name") String name);
}
