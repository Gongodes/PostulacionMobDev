package cl.gonzalo.prueba.services;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import cl.gonzalo.prueba.model.Characters;
import cl.gonzalo.prueba.model.Location;
import cl.gonzalo.prueba.model.Root;



@Service
public class ApiConServiceImpl implements ApiConServiceChar {

	
	@Override
	public Characters getChar(String id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate
				.exchange("https://rickandmortyapi.com/api/character/" + id, HttpMethod.GET, entity, Characters.class)
				.getBody();
	}

	@Override
	public Location getLoc(String id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate
				.exchange("https://rickandmortyapi.com/api/location/" + id, HttpMethod.GET, entity, Location.class)
				.getBody();
	}

}
