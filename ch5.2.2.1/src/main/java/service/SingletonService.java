package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.PrototypeRepository;

@Service
public class SingletonService {

    @Autowired
    private PrototypeRepository prototypeRepository;

    public int logic(){
        prototypeRepository.add();
        return prototypeRepository.getCount();
    }
}
