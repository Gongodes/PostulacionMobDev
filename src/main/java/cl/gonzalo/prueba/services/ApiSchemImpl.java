package cl.gonzalo.prueba.services;

import cl.gonzalo.prueba.model.Characters;
import cl.gonzalo.prueba.model.Location;
import cl.gonzalo.prueba.model.Origin;
import cl.gonzalo.prueba.model.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiSchemImpl implements ApiSchemService {

    @Autowired
    private ApiConServiceImpl service;

    @Override
    public Root calculo(String id) {
        Origin origin = new Origin();
        Characters character = service.getChar(id);
        String string = character.getOrigin().getUrl();
        String idloc = string.substring(string.length() - 1);
        Location location = service.getLoc(idloc);
        Root root = new Root();
        int count = character.getEpisode().length; 
        origin.setName(location.getName());
        origin.setUrl(location.getUrl());
        origin.setDimension(location.getDimension());
        origin.setResidents(location.getResidents());
        root.setId(character.getId());
        root.setName(character.getName());
        root.setStatus(character.getStatus());
        root.setSpecies(character.getSpecies());
        root.setType(character.getType());
        root.setEpisode_count(count);
        root.setOrigin(origin);

        return root;

    }

}
