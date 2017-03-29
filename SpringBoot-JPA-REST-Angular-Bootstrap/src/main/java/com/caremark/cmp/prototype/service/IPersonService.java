package com.caremark.cmp.prototype.service;

import java.util.List;

import com.caremark.cmp.prototype.entity.Person;

public interface IPersonService {
     List<Person> getAllPersons();
     Person getPersonById(int pid);
     boolean addPerson(Person person);
     void updatePerson(Person person);
     void deletePerson(int pid);
}
