/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequielmartin.veterinaria.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;

    //Hago que cada persona pueda tener una y solo una mascota
    @OneToMany
    private List<Mascota> listaMascotas;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, Integer edad, List<Mascota> listaMascotas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.listaMascotas = listaMascotas;
    }
}
