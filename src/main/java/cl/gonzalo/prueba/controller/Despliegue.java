
package cl.gonzalo.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Despliegue {
    
    @GetMapping("/")
    public String pagina(){
    
        return "index";
    
    }
    
}
