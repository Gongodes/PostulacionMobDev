
package cl.gonzalo.prueba.apiSchemImpl;

import cl.gonzalo.prueba.model.Root;
import org.springframework.stereotype.Service;


@Service
public interface ApiSchemService {
    
    public Root calculo(String id);
    
}
