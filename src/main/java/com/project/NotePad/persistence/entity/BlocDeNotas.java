package com.project.NotePad.persistence.entity;

import javax.persistence.*;
import java.sql.Blob;
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
    private String fecha;
    @Lob
    private byte[] imagen;

    public Integer getIdnota() {
        return idnota;
    }

    public void setIdnota(Integer idnota) {
        this.idnota = idnota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public byte[] getImagen(){
        return imagen;
    }
    public void setImagen(byte[] imagen){
        this.imagen = imagen;
    }
}
