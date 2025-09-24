/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequielmartin.veterinaria.controller;

import com.ezequielmartin.veterinaria.model.Mascota;
import com.ezequielmartin.veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("/mascotas/traer")
    public List<Mascota> traerMascotas() {
        return mascotaService.findAllMascotas();
    }

    @GetMapping("/mascotas/traer/{id}")
    public Mascota traerMascota(@PathVariable Long id) {
        return mascotaService.findMascotaById(id);
    }

    @PostMapping("/mascotas/crear")
    public Mascota crearMascota(@RequestBody Mascota mascota) {
        return mascotaService.saveMascota(mascota);
    }

    @DeleteMapping("/mascotas/borrar/{id}")
    public void borrarMascota(@PathVariable Long id) {
        mascotaService.deleteMascota(id);
    }

    @PutMapping("/mascotas/editar/{id_original}")
    public Mascota updateMascota(@PathVariable Long id_original,
            @RequestParam(required = false, name = "nombre") String nombre,
            @RequestParam(required = false, name = "especie") String especie,
            @RequestParam(required = false, name = "raza") String raza,
            @RequestParam(required = false, name = "color") String color) {
        return mascotaService.updateMascota(id_original, nombre, especie, raza, color);
    }
}
