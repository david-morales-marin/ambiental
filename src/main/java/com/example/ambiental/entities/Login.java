package com.example.ambiental.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Login")
public class Login implements Serializable {

    private static final Integer SerialVersionUID = 432;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "tipo_Documento")
    private String tipoDocumento;

    @Column(name = "documento")
    private Integer documento;

    public Login() {}

    public Login(Integer id, String tipoDocumento, Integer documento) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
}
