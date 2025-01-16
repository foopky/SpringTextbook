package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Parrot {
    private String name="KoKo";

    @Override
    public String toString(){
        return "Parrot : " + name;
    }
}
