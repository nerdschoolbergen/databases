package no.nerdschool.database.repositories;

import no.nerdschool.database.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long > {



}
