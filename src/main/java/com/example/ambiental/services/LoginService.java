package com.example.ambiental.services;

import com.example.ambiental.entities.Login;
import com.example.ambiental.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public List<Login> obtenerLogins(){
        return this.loginRepository.findAll();
    }

    public Optional<Login> obtenerLoginXId(int id){
        return this.loginRepository.findById(id);
    }

    public Login CrearUsuario(Login nuevoLogin){
        return this.loginRepository.save(nuevoLogin);
    }

    public void eliminarLogin(int id){
        this.loginRepository.deleteById(id);
    }

    public Login editarLogin(Login login, int id) {
        Login login1 = loginRepository.findById(id).get();

        if (Objects.nonNull(
                login.getDocumento())
                && !"".equalsIgnoreCase(
                login.getDocumento().toString())) {
            login1.setDocumento(
                    login.getDocumento());

        }
        if (Objects.nonNull(
                login.getTipoDocumento())
                && !"".equalsIgnoreCase(
                        login.getTipoDocumento().toString())){
            login1.setTipoDocumento(
                    login.getTipoDocumento());
        }
        return this.loginRepository.save(login1);
    }
}
