package com.acme.application;

import com.acme.PersonService;
import com.acme.TestHelpers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PersonControllerTest {

    private PersonService personServiceMock = TestHelpers.personServiceMock();
    private PersonController personController = new PersonController(personServiceMock);

    @Test
    public void testSimple() {
        Assertions.assertTrue(personController.findByName("Homer").isPresent());
    }

    @Test
    public void assertMockitoIsAvailable() {
        Assertions.assertNotNull(Mockito.mock(PersonService.class));
    }

}
