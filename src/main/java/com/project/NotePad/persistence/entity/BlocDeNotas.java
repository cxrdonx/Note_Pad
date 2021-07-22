package com.project.NotePad.persistence.entity;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "notes")
public class BlocDeNotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nota")
    private Integer idnota;
    private String titulo;
    private String nota;
    private DateFormat fecha;

    public Integer getIdnota() {
        return idnota;
    }

    public void setIdnota(Integer idnota) {
        this.idnota = idnota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public DateFormat getFecha() {
        return fecha;
    }

    public void setFecha(DateFormat fecha) {
        this.fecha = fecha;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
