package service;

import jakarta.inject.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PrototypeRepository;

@Service
public class SingletonService {
    @Autowired
    private Provider<PrototypeRepository> prototypeRepositoryProvider;

    public int logic(){
        PrototypeRepository prototypeRepository = prototypeRepositoryProvider.get();
        prototypeRepository.add();
        return prototypeRepository.getCount();
    }
}
