package com.corenetworks.Controlador.service;

import com.corenetworks.Controlador.modelo.Lugar;

import java.util.List;

public interface ILugarService {
    Lugar insertar (Lugar l);
    Lugar modificar(Lugar l);
    void eliminar (int idLugar);
    List<Lugar> obtenerTodos();
    Lugar obtenerUno(int idLugar);
}
