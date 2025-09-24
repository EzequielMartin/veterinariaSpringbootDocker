/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequielmartin.veterinaria.service;

import com.ezequielmartin.veterinaria.model.Mascota;
import com.ezequielmartin.veterinaria.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> findAllMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota findMascotaById(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public Mascota saveMascota(Mascota Mascota) {
        return mascotaRepository.save(Mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public Mascota updateMascota(Long idOriginal, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        Mascota mascotaEditar = this.findMascotaById(idOriginal);
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            mascotaEditar.setNombre(nuevoNombre);
        }
        if (nuevaEspecie != null && !nuevaEspecie.isEmpty()) {
            mascotaEditar.setEspecie(nuevaEspecie);
        }
        if (nuevaRaza != null && !nuevaRaza.isEmpty()) {
            mascotaEditar.setRaza(nuevaRaza);
        }
        if (nuevoColor != null && !nuevoColor.isEmpty()) {
            mascotaEditar.setColor(nuevoColor);
        }
        return this.saveMascota(mascotaEditar);
    }
}
