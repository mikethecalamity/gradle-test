package com.acme;

import org.dummy.utils.Utilities;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonService {

    public Optional<Person> findByLastName(String lastName) {
        return repo.stream().filter(p -> lastName.equals(p.getLastName())).findFirst();
    }

    public List<Person> findAll() {
        return repo;
    }

    public Person transform(Person person) {
        person.setFirstName(Utilities.magicString(person.getFirstName()));
        return person;
    }

    private List<Person> repo = Arrays.asList(
            new Person("john", "doe"),
            new Person("albert", "eintein")
    );

}
