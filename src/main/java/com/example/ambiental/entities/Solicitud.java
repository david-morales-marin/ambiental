package com.example.ambiental.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Solicitud")
public class Solicitud implements Serializable  {

    private static final Integer SerialVersionUID = 432;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "tipo_Documento")
    private Integer tipoDocumento;

    @Column(name = "nombre_solicitante")
    private String nombreSolicitante;

    @Column(name = "ubicacion")
    private String ubicacion;

    @Column(name = "categorias")
    private String categoria;

    @Column(name = "vencimiento")
    private String vencimiento;

    public Solicitud() {
    }

    public Solicitud(Integer id, Integer tipoDocumento, String nombreSolicitante, String ubicacion, String categoria, String vencimiento) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.nombreSolicitante = nombreSolicitante;
        this.ubicacion = ubicacion;
        this.categoria = categoria;
        this.vencimiento = vencimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
}