
package cl.gonzalo.prueba.services;

import cl.gonzalo.prueba.model.Root;
import org.springframework.stereotype.Service;


@Service
public interface ApiSchemService {
    
    public Root calculo(String id);
    
}
