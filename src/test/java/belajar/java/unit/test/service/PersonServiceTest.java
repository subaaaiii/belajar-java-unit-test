package belajar.java.unit.test.service;

import belajar.java.unit.test.data.Person;
import belajar.java.unit.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions(@ExtendWith(MockitoExtension.class)
)
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp(){
        personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{personService.get("Not found");
        });
    }

    @Test
    void testGetPersonSuccess(){
        //behavior mockito
        Mockito.when(personRepository.selectById("eko"))
                .thenReturn(new Person("eko", "eko"));

        var person = personService.get("eko");

        Assertions.assertNotNull(person);
    }
    @Test
    void testRegisterSuccess(){
        var person = personService.register("Eko");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Eko", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1)).insert(new Person(person.getId(), "Eko"));

    }
}
