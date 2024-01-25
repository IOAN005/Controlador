package com.corenetworks.Controlador.service;

import com.corenetworks.Controlador.modelo.Lugar;
import com.corenetworks.Controlador.repository.ILugarRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarService implements ILugarService {
    @Autowired
    private ILugarRepo repoLugar;
    @Override
    public Lugar insertar(Lugar l) {
        return repoLugar.save(l);
    }

    @Override
    public Lugar modificar(Lugar l) {
        return repoLugar.save(l);
    }

    @Override
    public void eliminar(int idLugar) {repoLugar.deleteById(idLugar);

    }

    @Override
    public List<Lugar> obtenerTodos() {
        return repoLugar.findAll();
    }

    @Override
    public Lugar obtenerUno(int idLugar) {
        return repoLugar.findById(idLugar).orElse(new Lugar());
    }
}
