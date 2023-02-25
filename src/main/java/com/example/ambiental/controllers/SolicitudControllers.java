package com.example.ambiental.controllers;

import com.example.ambiental.entities.Login;
import com.example.ambiental.entities.Solicitud;
import com.example.ambiental.services.LoginService;
import com.example.ambiental.services.SolicitudServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitud")
public class SolicitudControllers {

    @Autowired
    public SolicitudServices solicitudServices;

    public SolicitudControllers(SolicitudServices solicitudServices) {
        this.solicitudServices = solicitudServices;
    }

    @GetMapping("/solicitudes")
    public List<Solicitud> obtenerSolicitudes() {
        return this.solicitudServices.obtenerSolicitudes();
    }

    @GetMapping("/solicitud/{id}")
    public Optional<Solicitud> obtenerXSolicitud(@PathVariable("id") int id) {
        return this.solicitudServices.obtenerSolicitudXId(id);
    }

    @PostMapping("/registrarSolicitud")
    public Solicitud registrarSolicitud(@RequestBody Solicitud solicitud) {
        return this.solicitudServices.crearSolicitud(solicitud);
    }

    @DeleteMapping("/eliminarSolicitud/{id}")
    public String eliminarSolicitud(@PathVariable("id") int id) {
        this.solicitudServices.eliminarSolicitud(id);
        return "La Solicitud ha sido eliminado correctamente";
    }

    @PutMapping("/actualizarSolicitud/{id}")
    public Solicitud editarSolicitud(@PathVariable("id") int id, @RequestBody Solicitud solicitud) {
        return this.solicitudServices.editarSolicitud(solicitud , id);
    }

}