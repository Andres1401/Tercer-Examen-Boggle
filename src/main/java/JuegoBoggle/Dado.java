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
public class Dado {
   
    protected int lados=6; //Numero de caras del dado
    protected int numero=1; // Referencia del lado visible del dado
    protected char cara1;
    protected char cara2;
    protected char cara3;
    protected char cara4;
    protected char cara5;
    protected char cara6;
    protected char letra;
    //Asigna el valor a cada cara a base de un numero 
    public Dado(char c1,char c2,char c3,char c4,char c5,char c6) {
       
       cara1=c1;
       cara2=c2;
       cara3=c3;
       cara4=c4;
       cara5=c5;
       cara6=c6;
       
    }
    
    public void lanzar(){
    numero=(int)(Math. random()*lados+1);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getLados() {
        return lados;
    }

    public char getCara1() {
        return cara1;
    }

    public char getCara2() {
        return cara2;
    }

    public char getCara3() {
        return cara3;
    }

    public char getCara4() {
        return cara4;
    }

    public char getCara5() {
        return cara5;
    }

    public char getCara6() {
        return cara6;
    }
    
    
    
    
    
    
}
