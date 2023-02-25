package com.example.ambiental.repository;

import com.example.ambiental.entities.DatosPersonales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosPersonalesRepository extends JpaRepository<DatosPersonales, Integer> {
}
