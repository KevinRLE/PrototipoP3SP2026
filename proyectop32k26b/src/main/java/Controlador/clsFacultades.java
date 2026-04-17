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

    public clsFacultades(int faculcodigo, String faculnombre, String faculstatus) {
        this.faculcCodigo = faculcodigo;
        this.faculnombre = faculnombre;
        this.faculstatus = faculstatus;
    }

    public String getFaculcodigo() {
        return faculcodigo;
    }

    public void setFaculcodigo(int faculcodigo) {
        this.faculcCodigo = faculcodigo;
    }

    public String getPernombre() {
        return faculnombre;
    }

    public void setPernombre(String faculnombre) {
        this.faculnombre = faculnombre;
    }

    public String getPerestado() {
        return faculstatus;
    }

    public void setPerestado(String perEstado) {
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