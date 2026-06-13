/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Gonzalo Achucarro
 */
public class PedidoObra {
    private int numeroPedidoObra;
    private String ubicacion;
    private String tamaño;
    private LocalDate fechaCreacion;
    private LocalDate fechaReparacion;
    private String observaciones;
    private Brigada brigada;
    
    public PedidoObra(int numeroPedidoObra, String ubicacion, String tamaño, LocalDate fechaCreacion) {
        this.numeroPedidoObra = numeroPedidoObra;
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
        this.fechaCreacion = fechaCreacion;
        this.fechaReparacion = null;
    }
    
    public void asignarBrigada(Brigada brigada){
        this.brigada = brigada;
    }

    public void finalizarObra(LocalDate fechaEfectiva, String observaciones){
        this.fechaReparacion = fechaEfectiva;
        this.observaciones = observaciones;
    }

    public Brigada getBrigada() {
        return brigada;
    }
    
    
    
}
