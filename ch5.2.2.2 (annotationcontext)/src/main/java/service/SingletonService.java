package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.PrototypeRepository;

@Service
public class SingletonService {

   @Autowired
   private ApplicationContext context;

    public int logic(){
        PrototypeRepository prototypeRepository = context.getBean(PrototypeRepository.class);
        prototypeRepository.add();
        return prototypeRepository.getCount();
    }
}
