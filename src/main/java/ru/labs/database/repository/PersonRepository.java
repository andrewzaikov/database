package ru.labs.database.repository;

import org.springframework.data.repository.CrudRepository;
import ru.labs.database.entity.Person;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findByFirstName(String firstName);
}
