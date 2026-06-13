/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gonzalo Achucarro
 */
public class Brigada {
    private int numero;
    private String nombre;
    private int cantidadTrabajadores;
    private String equipamiento;
    private String materialesNecesarios;
    private Trabajador jefeBrigada;
    private List<Trabajador> trabajadores;

    public Brigada(int numero, String nombre, String equipamiento, String materialesNecesarios, Trabajador jefe) {
        this.numero = numero;
        this.nombre = nombre;
        this.equipamiento = equipamiento;
        this.materialesNecesarios = materialesNecesarios;
        this.jefeBrigada = jefe;
        if(jefe != null) jefe.setLibre(false);
        this.trabajadores = new ArrayList<>();
        this.cantidadTrabajadores = 1;
    }
    
    public void agregarTrabajador(Trabajador t){
        if(this.trabajadores.size() < 3 && t != null){
            this.trabajadores.add(t);
            t.setLibre(false);
            this.cantidadTrabajadores = 1 + trabajadores.size();
        }
    }
    
    public void liberarBrigada(){
        if(jefeBrigada != null) jefeBrigada.setLibre(true);
        for(Trabajador t : trabajadores){
            t.setLibre(true);
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Trabajador getJefeBrigada() {
        return jefeBrigada;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }
    
    
    
    
}
