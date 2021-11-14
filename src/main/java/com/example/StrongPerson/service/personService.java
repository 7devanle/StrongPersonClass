package com.example.StrongPerson.service;

import com.example.StrongPerson.dao.PersonDao;
import com.example.StrongPerson.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class personService {
    private final PersonDao personDao;

    @Autowired
    public personService(@Qualifier("Postgres") PersonDao personDao) {
        this.personDao = personDao;
    }
    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
    public List<Person> getAllPeople(){
        return personDao.getListOfPeople();
    }
    public Optional<Person> getPersonById(UUID id){
        return personDao.getPersonbyId(id);
    }
    public int deleteperson(UUID id){
        return personDao.deletePersonById(id);
    }
    public int updatePersonById(UUID id, Person newPerson){
        return personDao.UpdatePerson(id, newPerson);
    }
}
