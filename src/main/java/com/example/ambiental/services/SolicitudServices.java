package com.example.ambiental.services;

import com.example.ambiental.entities.Solicitud;
import com.example.ambiental.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SolicitudServices {

    @Autowired
    SolicitudRepository solicitudRepository;

    public SolicitudServices(SolicitudRepository solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }

    public List<Solicitud> obtenerSolicitudes(){
        return this.solicitudRepository.findAll();
    }

    public Optional<Solicitud> obtenerSolicitudXId(int id){
        return this.solicitudRepository.findById(id);
    }

    public Solicitud crearSolicitud(Solicitud nuevaSolicitud){
        return  this.solicitudRepository.save(nuevaSolicitud);
    }

    public void eliminarSolicitud(int id){
        this.solicitudRepository.deleteById(id);
    }

    public Solicitud editarSolicitud(Solicitud solicitud, int id){
        Solicitud solicitud1 = solicitudRepository.findById(id).get();

        if (Objects.nonNull(
                solicitud.getTipoDocumento())
                && !"".equalsIgnoreCase(
                solicitud.getTipoDocumento().toString())
        ) {
            solicitud1.setTipoDocumento(
                    solicitud.getTipoDocumento());
        }
        if (Objects.nonNull(
                solicitud.getNombreSolicitante())
                && !"".equalsIgnoreCase(
                solicitud.getNombreSolicitante().toString())
        ) {
            solicitud1.setNombreSolicitante(
                    solicitud.getNombreSolicitante());
        }
        if (Objects.nonNull(
                solicitud.getUbicacion())
                && !"".equalsIgnoreCase(
                solicitud.getUbicacion().toString())
        ) {
            solicitud1.setUbicacion(
                    solicitud.getUbicacion());
        }
        if (Objects.nonNull(
                solicitud.getCategoria())
                && !"".equalsIgnoreCase(
                solicitud.getCategoria().toString())
        ) {
            solicitud1.setCategoria(
                    solicitud.getCategoria());
        }
        if (Objects.nonNull(
                solicitud.getVencimiento())
                && !"".equalsIgnoreCase(
                solicitud.getVencimiento().toString())
        ) {
            solicitud1.setVencimiento(
                    solicitud.getVencimiento());
        }
        return this.solicitudRepository.save(solicitud1);
    }

}
