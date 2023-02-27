package com.example.ambiental.controllers;

import com.example.ambiental.entities.DatosPersonales;
import com.example.ambiental.entities.Solicitud;
import com.example.ambiental.services.DatosPeronalesService;
import com.example.ambiental.services.SolicitudServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/datosPersonales")
public class DatosPersonalesController {
    @Autowired
    public DatosPeronalesService datosPeronalesService;

    public DatosPersonalesController(DatosPeronalesService datosPeronalesService) {
        this.datosPeronalesService = datosPeronalesService;
    }

    @GetMapping("/TodosDatosPersonales")
    public List<DatosPersonales> obtenerDatosPersonales() {
        return this.datosPeronalesService.obtenerDatosPersonales();
    }

    @GetMapping("/DatosPersonales/{id}")
    public Optional<DatosPersonales> obtenerXUsuario(@PathVariable("id") int id) {
        return this.datosPeronalesService.obtenesDatosPersonalesXId(id);
    }

    @PostMapping("/registrarDatosPersonales")
    public DatosPersonales registrarDatosPersonales(@RequestBody DatosPersonales datosPersonales) {
        return this.datosPeronalesService.registrarUsuario(datosPersonales);
    }

    @DeleteMapping("/eliminarDatosPersonales/{id}")
    public String eliminarDatosPersonales(@PathVariable("id") int id) {
        this.datosPeronalesService.eliminarDatosPeronales(id);
        return "Sus Datos Personales han sido eliminados correctamente";
    }

    @PutMapping("/actualizarDatosPersonales/{id}")
    public DatosPersonales editarDatosPersonales(@PathVariable("id") int id, @RequestBody DatosPersonales datosPersonales) {
        return this.datosPeronalesService.editarRegistro(datosPersonales , id);
    }

}