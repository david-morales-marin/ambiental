package com.example.ambiental.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DatosPersonales")
public class DatosPersonales implements Serializable {

    private static final Integer SerialVersionUID = 432;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "tipo_persona")
    private Enum tipoPersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo_identificacion")
    private Enum tipoIdentificacion;

    @Column(name = "numero_Identificacion")
    private Integer numeroIdentificacion;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "telefono")
    private Integer telefono;

    public DatosPersonales() {
    }

    public DatosPersonales(Integer id, Enum tipoPersona, String nombre, Enum tipoIdentificacion, Integer numeroIdentificacion, String direccion, String municipio, String departamento, Integer telefono) {
        this.id = id;
        this.tipoPersona = tipoPersona;
        this.nombre = nombre;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.direccion = direccion;
        this.municipio = municipio;
        this.departamento = departamento;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Enum getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(Enum tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enum getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(Enum tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}
