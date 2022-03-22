package cl.gonzalo.prueba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Characters {
	
	private int id;
        private String name;
        private String status;
        private String species;
        private String type;
	private String[] episode;
        private Origin origin;

}
