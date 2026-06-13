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
public class InformeRotura {
    private int codinf;
    private LocalDate fechaInforme;
    private String problema;
    private int codigoUrgencia;
    private Ciudadano ciudadano; 
    private Bache bache;
    private PedidoObra pedido;
    
    public InformeRotura(int codinf, LocalDate fechaInforme, String problema, int codigoUrgencia, Bache bache, Ciudadano ciudadano) {
        this.codinf = codinf;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.codigoUrgencia = codigoUrgencia;
        this.bache = bache;
        this.ciudadano = ciudadano;
        this.pedido = null;
    }
    
    public void asociarPedido(PedidoObra pedido){
        this.pedido = pedido;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public Bache getBache() {
        return bache;
    }

    public PedidoObra getPedido() {
        return pedido;
    }
    
    
}
