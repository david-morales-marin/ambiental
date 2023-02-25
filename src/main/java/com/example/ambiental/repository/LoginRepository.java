package com.example.ambiental.repository;

import com.example.ambiental.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository< Login, Integer> {
}
