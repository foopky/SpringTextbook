package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {
    private String name="Ella";
//  Parrot 객체를 final로 설정하여 생성자로 초기화 할 수 있다.
    private final Parrot parrot;

//  생성자에 Autowired 애너테이션을 이용하여 생성자로 의존성 주입
    @Autowired
    public Person(Parrot parrot){
        this.parrot = parrot;
    }
}
