/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoBoggle;

import java.util.HashSet;

/**
 *
 * @author Jesus Andres
 */
public class Jugador {
    
    
    public Jugador(){
    }
    //Metodo para revisar la palabras en español
    public boolean ingresarPalabra(String palabra,int mapa){
    boolean guarda;
    boolean encontrada=false;
    if(mapa==1){
    if(palabra.equals("CAER"))
        encontrada=true;
    else if(palabra.equals("DONAS"))
        encontrada=true;
   
    
    else if(palabra.equals("DONAR"))
        encontrada=true;
        }
    else if(mapa==2){
    if(palabra.equals("MATO"))
        encontrada=true;
    else if(palabra.equals("TENOR"))
        encontrada=true;
    else if(palabra.equals("MEAGO"))
        encontrada=true;
    else if(palabra.equals("RAMA"))
        encontrada=true;
    else if(palabra.equals("MAGO"))
        encontrada=true;
    else if(palabra.equals("SOGA"))
        encontrada=true;
    else if(palabra.equals("SACO"))
        encontrada=true;
    
    
    
        }
    else if(mapa==3){
    if(palabra.equals("MALO"))
        encontrada=true;
    else if(palabra.equals("COLA"))
        encontrada=true;
    else if(palabra.equals("COPA"))
        encontrada=true;
    else if(palabra.equals("CONOS"))
        encontrada=true;
    else if(palabra.equals("SANO"))
        encontrada=true;
        }
    else if(mapa==4){
    if(palabra.equals("LEER"))
        encontrada=true;
    else if(palabra.equals("HORA"))
        encontrada=true;
    else if(palabra.equals("REAL"))
        encontrada=true;
    else if(palabra.equals("ORO"))
        encontrada=true;}
    return encontrada;
    }
}
