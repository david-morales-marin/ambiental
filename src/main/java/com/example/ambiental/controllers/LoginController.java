package com.example.ambiental.controllers;

import com.example.ambiental.entities.Login;
import com.example.ambiental.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    public LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/logins")
    public List<Login> obtenerLogins(){
        return this.loginService.obtenerLogins();
    }

    @GetMapping("/login/{id}")
    public Optional<Login> obtenerXLogin(@PathVariable("id") int id){
        return this.loginService.obtenerLoginXId(id);
    }

    @PostMapping("/registrarLogin")
    public Login registrarLogin(@RequestBody Login login){
        return this.loginService.CrearUsuario(login);
    }

    @DeleteMapping("/eliminarLogin/{id}")
    public String eliminarLogin(@PathVariable ("id") int id){
        this.loginService.eliminarLogin(id);
        return "El usuario ha sido eliminado correctamente";
    }

    @PutMapping("/actualizarLogin/{id}")
    public Login editarLogin(@PathVariable("id") int id, @RequestBody Login login){
        return this.loginService.editarLogin(login , id);
    }

}
