package com.example.venta.dto;

import lombok.Data;

@Data
public class Cliente {
    private Integer id;
    private String numeroDocumento;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
}
