/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gonzalo Achucarro
 */
public class Trabajador {
    
    private int id;
    private String nombre;
    private String puesto;
    private boolean libre;

    public Trabajador(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.libre = true;
    }
    
    public void setLibre(boolean libre){
        this.libre = libre;
    }
    
    public boolean isLibre(){
        return libre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    
    
    
}
