package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {
    private String name="Ella";
    private final Parrot parrot;

    @Autowired
    public Person(@Qualifier("parrot2") Parrot parrot){
        this.parrot = parrot;
    }
}
