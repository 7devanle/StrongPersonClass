package com.example.StrongPerson.dao;

import com.example.StrongPerson.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("Postgres")
public class FakeDatabaseAccessSevice implements PersonDao{
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> getListOfPeople() {
        return List.of(new Person(UUID.randomUUID(), "FROM POSTGRESS DB"));
    }

    @Override
    public Optional<Person> getPersonbyId(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int UpdatePerson(UUID id, Person person) {
        return 0;
    }
}
