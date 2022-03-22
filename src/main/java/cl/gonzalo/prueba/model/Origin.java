package cl.gonzalo.prueba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Origin {
	
	
	private String name;
	
	private String url;
	
	private String dimension;
	
	private String[] residents;

	

}
