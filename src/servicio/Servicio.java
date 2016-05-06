/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.io.FileNotFoundException;
import java.util.Scanner;
import data.*;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class Servicio {
    
    Scanner lectura = new Scanner(System.in);
    ArrayList <Perfil> perfiles;
    
        
    public Perfil crearPerfil() {
        String nombre;
        String nick;
        int edad;
        String clave;
        String correo;
        do{
            System.out.println("Ingrese nombre");
            nombre = lectura.next();
        }while(nombre.length() < 100);
        System.out.println("Ingrese nick");
        nick = lectura.next();
        do{
            System.out.println("Ingrese edad");
            edad = lectura.nextInt(); 
        }while(edad > 18);
        do{
            System.out.println("Ingrese clave");
            clave = lectura.next(); 
        }while(!"123456".equals(clave));
        System.out.println("Ingrese correo");
        correo = lectura.next();
        Perfil perfil = new Perfil (nombre,nick,edad,clave,correo);
        perfiles.add(perfil);
        return perfil;
        
    }
    
    public Perfil buscar(String nombre){
        for(Perfil perfil:this.perfiles){
            if (perfil.getNombre().equalsIgnoreCase(nombre)) 
                return perfil;
        }
        return null;
    }
    
    public Fotografia crearFoto(){
        String nombre;
        String descripcion;
        Comentario [] comentario = new Comentario [5];
        
        return null;
    }
    
    public Comentario crearComentario(){
        return null;
    }
}
