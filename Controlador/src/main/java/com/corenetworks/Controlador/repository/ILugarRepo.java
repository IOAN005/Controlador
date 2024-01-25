package com.corenetworks.Controlador.repository;

import com.corenetworks.Controlador.modelo.Lugar;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugarRepo extends JpaRepository<Lugar,Integer> {
}
