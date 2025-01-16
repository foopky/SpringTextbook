package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Person {
    private String name="Ella";
    private Parrot parrot;
}
