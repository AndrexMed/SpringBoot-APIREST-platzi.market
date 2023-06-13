package com.platzi.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
public class Cliente {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idCliente;
    private String nombre;
    private String apellidos;
    private Double celular;
    private String direccion;
    @Column(name = "correo_electronico")
    private String correoElectronico;
}
