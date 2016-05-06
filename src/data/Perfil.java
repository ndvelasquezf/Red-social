/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Perfil {
    
    private String nombre;
    private String nick;
    private int edad;
    private String clave;
    private String correo;
    private ArrayList <Fotografia> fotografia;
    

    public Perfil(String nombre, String nick, int edad, String clave, String correo) {
        this.nombre = nombre;
        this.nick = nick;
        this.edad = edad;
        this.clave = clave;
        this.correo = correo;
        
        
    }
 
    public void anadirFotografia(Fotografia fotografia){
        this.fotografia.add(fotografia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Perfil:" + " nombre=" + nombre + ", nick=" + nick + ", edad=" + edad + ", clave=" + clave + ", correo=" + correo + '}';
    }
    
    
    
    
}
