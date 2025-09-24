/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ezequielmartin.veterinaria.service;

import com.ezequielmartin.veterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {

    public List<Mascota> findAllMascotas();

    public Mascota findMascotaById(Long id);

    public Mascota saveMascota(Mascota Mascota);

    public void deleteMascota(Long id);

    public Mascota updateMascota(Long idOriginal, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor);
}
