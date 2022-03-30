package cl.gonzalo.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gonzalo.prueba.model.Root;

import cl.gonzalo.prueba.apiSchemImpl.ApiSchemImpl;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiSchemImpl service;

    @GetMapping("single/{id}")
    public Root buscarPorId(@PathVariable("id") String id) {

        return service.calculo(id);

    }

}
