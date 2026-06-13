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
public class Bache {
    private int numeroId;
    private String tamaño;
    private String calleA;
    private String calleB;
    private int altura;
    private String barrio;
    private int prioridad;
    private String estado;

    public Bache(int numeroId, String tamaño, String calleA, String calleB, int altura, String barrio, int prioridad) {
        this.numeroId = numeroId;
        this.tamaño = tamaño;
        this.calleA = calleA;
        this.calleB = calleB;
        this.altura = altura;
        this.barrio = barrio;
        this.prioridad = prioridad;
        this.estado = "sin arreglar";
    }
    
    public void actualizarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
