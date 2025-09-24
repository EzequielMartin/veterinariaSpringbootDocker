/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequielmartin.veterinaria.service;

import com.ezequielmartin.veterinaria.model.Persona;
import com.ezequielmartin.veterinaria.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona getPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona updatePersona(Long idOriginal, String nuevoNombre, String nuevoApellido, Integer nuevaEdad) {
        Persona personaEditar = this.getPersona(idOriginal);
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            personaEditar.setNombre(nuevoNombre);
        }
        if (nuevoApellido != null && !nuevoApellido.isEmpty()) {
            personaEditar.setApellido(nuevoApellido);
        }
        if (nuevaEdad != null) {
            personaEditar.setEdad(nuevaEdad);
        }
        return this.savePersona(personaEditar);
    }

    @Override
    public Persona updatePersonaMejorado(Persona persona) {
        return this.savePersona(persona);
    }
}
