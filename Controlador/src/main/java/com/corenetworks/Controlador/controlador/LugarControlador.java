package com.corenetworks.Controlador.controlador;

import com.corenetworks.Controlador.modelo.Lugar;
import com.corenetworks.Controlador.service.ILugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lugares")

public class LugarControlador {
    @Autowired
    private ILugarService lugarServicio;
    @GetMapping ("/{id}")
    public List<Lugar>obtenerTodosLugares(){
        return lugarServicio.obtenerTodos();

    }
    @GetMapping
    public Lugar obtenerUno(@PathVariable("id") int id){
        return lugarServicio.obtenerUno(id);
    }
    @PostMapping
    public Lugar insertarLugar(@RequestBody Lugar l){
        return lugarServicio.insertar(l);
    }
    @PutMapping
    public Lugar modificar(@RequestBody Lugar l){
        return lugarServicio.modificar(l);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")int id){
        lugarServicio.eliminar(id);
    }
}
