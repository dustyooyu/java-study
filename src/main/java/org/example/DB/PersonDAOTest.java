package org.example.DB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {
    PersonDAO personDAO = new PersonDAO();

    @BeforeEach // test 실행 전 먼저 실행
    void setUp() {
        personDAO.initPerson();
    }


    @Test
    void findByNamePerson() {
        String name = "leo";
        personDAO.insertPerson(name);
        assertEquals(name, personDAO.findByNamePerson(name).get().getName());
        assertNotEquals(name, personDAO.findByNamePerson("aa"));
        assertEquals(Optional.empty(), personDAO.findByNamePerson("aa")); // Optional<Person>로 반환, 없으면 Optional.empty()
        // Optional[001 leo]
    }

    @Test
    void findAllPerson() {
        personDAO.insertPerson("leo");
        personDAO.insertPerson("yui");
        assertEquals("[001 leo, 002 yui]", personDAO.findAllPerson().toString());
    }

    @Test
    void insertPerson() {

    }

    @Test
    void initPerson() {
        int cnt = personDAO.insertPerson("leo");
        assertEquals(1, cnt);
    }
}