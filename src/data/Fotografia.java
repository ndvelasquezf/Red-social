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
public class Fotografia {
    
    private String nombre;
    private String descripcion;
    private Comentario [] comentario = new Comentario [5];
    private Etiqueta [] etiqueta = new Etiqueta [5];

    public Fotografia(String nombre, String descripcion, Comentario[] comentario, Etiqueta[] etiqueta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.comentario = comentario;
        this.etiqueta = etiqueta;
    }
    
    public void anadirComentario(Comentario[] comentario){
        this.comentario = comentario;
    }
    
    public void anadirEtiqueta(Etiqueta[] etiqueta){
        this.etiqueta = etiqueta;
    }
}
