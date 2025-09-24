/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequielmartin.veterinaria.controller;

import com.ezequielmartin.veterinaria.model.Persona;
import com.ezequielmartin.veterinaria.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return personaService.getPersonas();
    }

    @GetMapping("/personas/traer/{id}")
    public Persona getPersona(@PathVariable Long id) {
        return personaService.getPersona(id);
    }

    @PostMapping("/personas/crear")
    public Persona createPersona(@RequestBody Persona persona) {
        return personaService.savePersona(persona);
    }

    @DeleteMapping("/personas/borrar/{id}")
    public void deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
    }

    @PutMapping("/personas/editar/{id}")
    public Persona updatePersona(@PathVariable Long id,
            @RequestParam(required = false, name = "nombre") String nombre,
            @RequestParam(required = false, name = "apellido") String apellido,
            @RequestParam(required = false, name = "edad") Integer edad) {
        return personaService.updatePersona(id, nombre, apellido, edad);
    }

    @PutMapping("/personas/editarMejorado")
    public Persona updatePersonaMejorado(@RequestBody Persona persona) {
        return personaService.updatePersonaMejorado(persona);
    }
}
