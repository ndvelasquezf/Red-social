/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.FileNotFoundException;
import java.util.Scanner;
import data.*;
import java.util.ArrayList;
import servicio.*;



/**
 *
 * @author PC
 */
public class UI {
    
    Servicio servicio = new Servicio();
    Scanner lectura = new Scanner(System.in);
    int opc=0;
    ArrayList <Perfil> perfiles;
    
    public void menu() throws FileNotFoundException{
        
        do{
        System.out.println("1. Crear Perfil "+
                "2.Ingresar Fotografia "+
                "3.Ingresar Comentario "+
                "4.Buscar Usuario "+
                "5.Listar Comentarios "+
                "6.Fotos etiqutadas "+
                "7.Buscar comentarios"+
                "8.Salir");
        opc = lectura.nextInt();
        switch(opc){
            case 1 :
                Perfil perfil= null;
                perfil = servicio.crearPerfil();
                
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                break;
            case 6 :
                break;
            case 7 :
                break;
            case 8 : System.out.println("Gracias.");
                break;
            default :
                break;
        }
        }while(opc!=8);
    }
    
}
