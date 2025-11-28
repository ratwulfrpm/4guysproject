
package com.mycompany.controldeasistenciaescolar;

public class RegistroDeEstudiantes {

    private String cedula;
    private String nombre;
    private String apellido;
    private int grado;
    private String seccion;

    public RegistroDeEstudiantes(String cedula, String nombre, String apellido, int grado, String seccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.seccion = seccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

}
