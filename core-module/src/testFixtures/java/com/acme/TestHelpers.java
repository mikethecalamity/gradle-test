package com.acme;

import org.dummy.utils.Utilities;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

public class TestHelpers {

    public static PersonService personServiceMock() {
        PersonService serviceMock = Mockito.mock(PersonService.class);
        Mockito.when(serviceMock.findByLastName(ArgumentMatchers.anyString())).then(invocation ->
                Simpsons.FAMILY.stream().filter(p -> p.getLastName().equals(invocation.getArgument(0)))
        );
        Mockito.when(serviceMock.findAll()).thenReturn(Simpsons.FAMILY);
        return serviceMock;
    }

    private static void dummy() {
        // utils-module classes are available here.
        Utilities.magicString("aaa");
    }

}
