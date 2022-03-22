
package cl.gonzalo.prueba;


import java.net.URI;
import java.net.URISyntaxException;
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class ResponseTest {
    @Test
    void ResponseTest() throws URISyntaxException   {
      
        
     RestTemplate restTemplate = new RestTemplate();
     
    final String endpoint = "http://localhost:8585/api/single/1";
    URI uri = new URI(endpoint);
 
    ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
     
    
    assertEquals(200, response.getStatusCodeValue());
    assertEquals(true, response.getBody().contains("Rick Sanchez"));

                }
    }
    

