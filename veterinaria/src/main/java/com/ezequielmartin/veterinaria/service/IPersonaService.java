/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ezequielmartin.veterinaria.service;

import com.ezequielmartin.veterinaria.model.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas();

    public Persona getPersona(Long id);

    public Persona savePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona updatePersona(Long idOriginal, String nuevoNombre, String nuevoApellido, Integer nuevaEdad);

    public Persona updatePersonaMejorado(Persona persona);
}
