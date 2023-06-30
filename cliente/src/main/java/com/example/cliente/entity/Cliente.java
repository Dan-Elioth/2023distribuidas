package com.example.cliente.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    private String dni;
    private String apellidoPaterno;
    private String apellidoMaterno;


    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    @PrePersist
    @PreUpdate
    public void prePersistAndUpdate() {
        LocalDateTime now = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        if (fechaCreacion == null) {
            fechaCreacion = now;
        }
        fechaActualizacion = now;
    }
}
