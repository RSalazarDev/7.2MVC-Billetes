/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author salaz
 */
public class Billete {

    private String fechaIni;
    private int cant;
    private double precio;
    private int mes;

    public Billete(String fechaIni, int cant) {
        this.fechaIni = fechaIni;
        this.cant = cant;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public int getCant() {
        return cant;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    

    public Double importe() {
        mes = Integer.parseInt(fechaIni.substring(5, 7));
        if (mes >= 5 & mes <= 9) {
            precio = 150.0;
        }else{
            precio = 90.0;
        }

        double precioSinIva = precio * cant;
        return precioSinIva * 1.21;
    }
}
