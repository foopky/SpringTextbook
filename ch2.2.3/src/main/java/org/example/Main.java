package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//      1. 스프링 컨텍스트에 추가할 인스턴스 생성
        Parrot x = new Parrot();
        x.setName("kiki");

//      2. 인스턴스를 반환할 Supplier를 정의
        Supplier<Parrot> parrotSupplier = () -> x;

//      3. registerBean() 메서드 호출 (Bean 등록)
        context.registerBean("parrot1",Parrot.class, parrotSupplier);

//      4. getBean
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}