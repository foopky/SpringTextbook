package service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.PrototypeRepository;

@Service
public class SingletonService {

   @Autowired
   @Lookup
   public PrototypeRepository getPrototypeRepository() {
       return null;
   }

    public int logic(){
        PrototypeRepository prototypeRepository = getPrototypeRepository();
        prototypeRepository.add();
        return prototypeRepository.getCount();
    }
}
