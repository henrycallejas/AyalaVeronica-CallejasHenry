/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

/**
 *
 * @author VERITO_AYALA
 */
public class Empleados {
    private String nombre;
    private double SalxHora;
    private int CantidadH;
    double Tsueldo;
    
    public Empleados () {
    }
    
     public Empleados(String nombre, double SalxHora,int CantidaH) {
        this.nombre = nombre;
        this.SalxHora = SalxHora;
        this.CantidadH = CantidadH;
        this.Tsueldo=getTsueldo();
       }

   public int getCantidadH() {
        return CantidadH;
    }

    public void setCantidadH(int CantidadH) {
        this.CantidadH = CantidadH;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalxHora() {
        return SalxHora;
    }

    public void setSalxHora(double SalxHora) {
        this.SalxHora = SalxHora;
    }
          
    public double getTsueldo(){
        return SalxHora*CantidadH;
   }
   
}    



    