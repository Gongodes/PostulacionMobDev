package cl.gonzalo.prueba.services;

import cl.gonzalo.prueba.model.Characters;
import cl.gonzalo.prueba.model.Location;


public interface ApiConServiceChar {
	
	public Characters getChar( String id);
	
	public Location getLoc( String id);

}

