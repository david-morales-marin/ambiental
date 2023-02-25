package com.example.ambiental.services;

import com.example.ambiental.entities.DatosPersonales;
import com.example.ambiental.repository.DatosPersonalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DatosPeronalesService {

    @Autowired
    DatosPersonalesRepository datosPersonalesRepository;

    public DatosPeronalesService(DatosPersonalesRepository datosPersonalesRepository) {
        this.datosPersonalesRepository = datosPersonalesRepository;
    }

    public List<DatosPersonales> obtenerDatosPersonales(){
        return this.datosPersonalesRepository.findAll();
    }

    public Optional<DatosPersonales> obtenesDatosPersonalesXId(int id){
        return this.datosPersonalesRepository.findById(id);
    }

    public DatosPersonales registrarUsuario(DatosPersonales nuevoRegistro){
        return this.datosPersonalesRepository.save(nuevoRegistro);
    }

    public void eliminarDatosPeronales(int id){
        this.datosPersonalesRepository.deleteById(id);
    }

    public DatosPersonales editarRegistro(DatosPersonales datosPersonales, int id){

        DatosPersonales datosPersonales1 = datosPersonalesRepository.findById(id).get();

        if (Objects.nonNull(
                datosPersonales.getTipoPersona())
                && !"".equalsIgnoreCase(
                datosPersonales.getTipoPersona().toString())){
            datosPersonales1.setTipoPersona(
                    datosPersonales.getTipoPersona());
        }
        if (Objects.nonNull(
                datosPersonales.getNombre())
                && !"".equalsIgnoreCase(
                datosPersonales.getNombre().toString())){
            datosPersonales1.setNombre(
                    datosPersonales.getNombre());
        }
        if (Objects.nonNull(
                datosPersonales.getTipoIdentificacion())
                && !"".equalsIgnoreCase(
                datosPersonales.getTipoIdentificacion().toString())){
            datosPersonales1.setTipoIdentificacion(
                    datosPersonales.getTipoIdentificacion());
        }
        if (Objects.nonNull(
                datosPersonales.getNumeroIdentificacion())
                && !"".equalsIgnoreCase(
                datosPersonales.getNumeroIdentificacion().toString())){
            datosPersonales1.setNumeroIdentificacion(
                    datosPersonales.getNumeroIdentificacion());
        }
        if (Objects.nonNull(
                datosPersonales.getDireccion())
                && !"".equalsIgnoreCase(
                datosPersonales.getDireccion().toString())){
            datosPersonales1.setDireccion(
                    datosPersonales.getDireccion());
        }
        if (Objects.nonNull(
                datosPersonales.getMunicipio())
                && !"".equalsIgnoreCase(
                datosPersonales.getMunicipio().toString())){
            datosPersonales1.setMunicipio(
                    datosPersonales.getMunicipio());
        }
        if (Objects.nonNull(
                datosPersonales.getDepartamento())
                && !"".equalsIgnoreCase(
                datosPersonales.getDepartamento().toString())){
            datosPersonales1.setDepartamento(
                    datosPersonales.getDepartamento());
        }
        if (Objects.nonNull(
                datosPersonales.getTelefono())
                && !"".equalsIgnoreCase(
                datosPersonales.getTelefono().toString())){
            datosPersonales1.setTelefono(
                    datosPersonales.getTelefono());
        }

        return this.datosPersonalesRepository.save(datosPersonales1);
    }
}
