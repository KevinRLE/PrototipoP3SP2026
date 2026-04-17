/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author WINDOWS
 */
public class clsFacultades {
    private String faculcodigo;
    private String faculnombre;
    private String faculstatus;
    private int faculcCodigo;


    public clsFacultades() {
    }

    public clsFacultades(String faculcodigo) {
        this.faculcodigo = faculcodigo;
    }

    public clsFacultades(String faculnombre, String faculstatus) {
        this.faculnombre = faculnombre;
        this.faculstatus = faculstatus;
    }

    public clsFacultades(String faculcodigo, String faculnombre, String faculstatus) {
        
        this.faculnombre = faculnombre;
        this.faculstatus = faculstatus;
    }

    public String getFaculcodigo() {
        return faculcodigo;
    }

    public String setFaculcodigo(String faculcodigo) {
        this.faculcodigo = faculcodigo;
        return null;
    }

    public String getFaculnombre() {
        return faculnombre;
    }

    public void setFaculnombre(String faculnombre) {
        this.faculnombre = faculnombre;
    }

    public String getFaculstatus() {
        return faculstatus;
    }

    public void setFaculstatus(String perEstado) {
        this.faculstatus = perEstado;
    }

    @Override
    public String toString() {
        return "Facultades{" +
                "faculCodigo=" + faculcodigo +
                ", faculnombre=" + faculnombre +
                ", faculstatus=" + faculstatus +
                '}';
    }
}