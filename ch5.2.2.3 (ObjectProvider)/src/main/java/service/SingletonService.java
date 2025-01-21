package service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.PrototypeRepository;

@Service
public class SingletonService {

   @Autowired
   private ObjectProvider<PrototypeRepository> prototypeRepositoryObjectProvider;

    public int logic(){
        PrototypeRepository prototypeRepository = prototypeRepositoryObjectProvider.getObject();
        prototypeRepository.add();
        return prototypeRepository.getCount();
    }
}
