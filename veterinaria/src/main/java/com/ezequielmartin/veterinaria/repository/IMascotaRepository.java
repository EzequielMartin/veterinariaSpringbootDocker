/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ezequielmartin.veterinaria.repository;

import com.ezequielmartin.veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ezequiel
 */
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {

}
