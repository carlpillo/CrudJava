package com.cursoceat.model;

import java.util.Date;

public class alumno {
    private int id;
    private String nombre , curso ;
    private Date fnacimiento ;
    private  double notaMedia;

    private final int TAM_NOMBRE = 50;

    public alumno(int id) {
        this.id = id;
    }

    public alumno(int id, String nombre, String curso, Date fnacimiento, double notaMedia) {
        this.id = id;
        setNombre(nombre);
    //    this.nombre = nombre;
        setCurso(curso);
     //   this.curso = curso;
        this.fnacimiento = fnacimiento;
        this.notaMedia = notaMedia;
    }


    /*metodo para delimitar caracteres del nombre 50 cararcteres*/

    public void setNombre(String nom){
        /*utilizamos las const TAM_NOMBRE*/
        this.nombre = nom.substring(0,Math.min(TAM_NOMBRE,nom.length()));
    }
    /*metodo para delimitar caracteres del curso 2 cararcteres*/

    public void setCurso(String curso){
        this.curso = curso.substring(0,Math.min(2,curso.length()));
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }


}
