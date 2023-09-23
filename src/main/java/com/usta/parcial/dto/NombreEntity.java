package com.usta.parcial.dto;

import lombok.Data;

import java.io.Serializable;

@Data

public class NombreEntity implements Serializable {
    private String nombre ;
    private String apellido;
}
