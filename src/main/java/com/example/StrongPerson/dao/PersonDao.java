package com.example.StrongPerson.dao;

import com.example.StrongPerson.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
    List<Person> getListOfPeople();
    Optional<Person> getPersonbyId(UUID id);
    int deletePersonById(UUID id);
    int UpdatePerson( UUID id, Person person);
}
