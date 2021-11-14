package com.example.StrongPerson.api;

import com.example.StrongPerson.model.Person;
import com.example.StrongPerson.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonControllers {
    private final personService personService;

    @Autowired
    public PersonControllers(personService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody @NonNull @Valid Person person){
        personService.addPerson(person);
    }
    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }
    @GetMapping(path = "{id}")
    public Person person(@PathVariable("id") UUID id){
        return personService.getPersonById(id)
                .orElse(null);
    }
    @DeleteMapping(path = "{id}")
    public void deletePerson(@PathVariable("id") UUID id){
        personService.deleteperson(id);
    }
    @PutMapping (path = "{id}")
    public void updatePerson(@PathVariable UUID id, @RequestBody @Valid Person personToUpdate){
        personService.updatePersonById(id, personToUpdate);
    }
}
