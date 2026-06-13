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
public class Ciudadano {
    private String nombre;
    private int contraseña;
    private String mail;

    public Ciudadano(){
    }

    public Ciudadano(String nombre, int contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    
    public boolean validarIngreso(int contra){
        return this.contraseña == contra;
    }
    
    public void cambioContraseña(String nuevaContra){
        this.contraseña = Integer.parseInt(nuevaContra);
    }
    
    public void delay(int mili){
        try{
            Thread.sleep(mili);
        }catch(InterruptedException e){
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }
    
    public boolean ciudadanosDiferentes(Ciudadano c2){
        if(c2 == null) return true;
        return !this.nombre.equals(c2.getNombre()) || this.contraseña != c2.getContraseña();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
    
}
