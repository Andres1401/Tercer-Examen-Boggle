/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoBoggle;

/**
 *
 * @author Jesus Andres
 */
public class DadoBoggle extends Dado{
    //se crean los dados con caras
    public DadoBoggle(char c1,char c2,char c3,char c4,char c5,char c6) {
        super(c1,c2,c3,c4,c5,c6);
        
    }
    //Metodo para mostrar los valores de los dados 
    public char getLetraCara(int numero){

        if(numero==1) letra=cara1;
        else if(numero==2) letra=cara2;
        else if(numero==3) letra=cara3;
        else if(numero==4) letra=cara4;
        else if(numero==5) letra=cara5;
        else if(numero==6) letra=cara6;
        
    return letra;}
    
    public String toString(){
    return "\n"+cara1+" "+cara2+" "+cara3+" "+cara4+" "+cara5+" "+cara6;}
    
}
