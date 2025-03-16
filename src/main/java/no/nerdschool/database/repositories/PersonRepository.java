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
            select p.*
            from people p
            where p.name like :name%
            """)
    List<Person> findByName(@Param("name") String name);

    @NativeQuery("""
            select distinct p.* from people p
            inner join casts c on p.id = c.person_id
            inner join jobs j on c.job_id = j.id
            where j.name='Director'
            limit 100
            """)
    List<Person> findAllDirectors();
}
