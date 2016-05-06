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
public class Comentario {
    
    private String texto;
    private Fecha fecha;

    public Comentario(String texto, Fecha fecha) {
        if(texto.length()<200){
        this.texto = texto;
        this.fecha = fecha;
        } else{
            System.out.println("Limite de caracteres en comentario. ");
        }
    }
    
    public void anadirFecha(Fecha fecha){
        this.fecha=fecha;
    }
    
    
}
