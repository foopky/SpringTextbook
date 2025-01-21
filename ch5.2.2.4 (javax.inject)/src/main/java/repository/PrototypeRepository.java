package repository;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PrototypeRepository {
    private int count = 0;

    public void add(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
