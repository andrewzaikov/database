package ru.labs.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.labs.database.entity.Person;
import ru.labs.database.repository.PersonRepository;

@Service
public class DBService {
    @Autowired
    private PersonRepository repository;

    public void run() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Rambo");
        repository.save(person);
        System.out.println("person created, id=" + person.getId());

        System.out.println("Persons:");
        for (var item : repository.findByFirstName("John")) {
            System.out.println("Item.firstName=" + item.getFirstName() + ", lastName=" + item.getLastName());
        }
    }
}
