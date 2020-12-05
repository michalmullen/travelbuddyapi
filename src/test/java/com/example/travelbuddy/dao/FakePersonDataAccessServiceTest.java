package com.example.travelbuddy.dao;

import com.example.travelbuddy.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class FakePersonDataAccessServiceTest {

    String name = "Bobby Jones";
    UUID id = UUID.randomUUID();


    @Test
    void insertPerson() {
        Person examplePerson = new Person(id, name);
        FakePersonDataAccessService example = new FakePersonDataAccessService();
        example.insertPerson(id, examplePerson);

        List<Person> db = example.getDB();
        Person newPerson = db.get(0);

        assertEquals(name, newPerson.getName());
        assertEquals(id, newPerson.getId());

        assertNotEquals(name, null);
        assertEquals(name, "Bobby Jones");

    }

    @Test
    void selectAllPeople() {
    }

    @Test
    void selectPersonById(UUID id) {
    }

    @Test
    void deletePersonById() {
    }

    @Test
    void updatePersonById() {
    }
}