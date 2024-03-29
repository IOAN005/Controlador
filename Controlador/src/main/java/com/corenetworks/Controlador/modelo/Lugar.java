package com.corenetworks.Controlador.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "lugares")
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLugar;
    @Column(length = 20,nullable = false)
    private String nombre;
//    @OneToMany(mappedBy = "lugar",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//     private List<Visitan>visitas;

    public Lugar(int idLugar, String nombre) {
        this.idLugar = idLugar;
        this.nombre = nombre;
    }
}
