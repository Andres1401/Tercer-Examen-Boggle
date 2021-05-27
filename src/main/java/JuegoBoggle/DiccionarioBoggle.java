/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoBoggle;
import java.util.ArrayList;
/**
 *
 * @author Jesus Andres
 */

public class DiccionarioBoggle {
    private ArrayList<String> PalabrasEsp=new ArrayList<String>(20);
    private ArrayList<String> PalabrasIng=new ArrayList<String>(20);
//diccionrio tentativo de palabras "no se utilizo, nomas sirvio de referencia"
    public DiccionarioBoggle() {
        PalabrasEsp.add("CAER");//3,1 4,1 5,1  5,2*        1
        PalabrasEsp.add("COLA");//5,3 5,2 5,5 4,5*3        3
        PalabrasEsp.add("HUIR");//2,2 2,3 3,3 4,3
        PalabrasEsp.add("TENOR");//1,3 1,2 2,2 2,1 3,1*    2
        PalabrasEsp.add("LADA");//3,2 4,2 4,3 4,4
        PalabrasEsp.add("TOSER");//1,3 1,4 2,4 2,3 3,3
        PalabrasEsp.add("DONAR");//4,2 4,3 4,4 3,4 3,3*    1
        PalabrasEsp.add("LEER");//5,5 4,5 3,5 2,5*   4
        PalabrasEsp.add("TOGA");//5,3 5,4 4,4 3,4
        PalabrasEsp.add("MALO");//3,5 4,5 5,5 5,4*   3
        PalabrasEsp.add("REME");//3,3 3,4 3,5 4,5
        PalabrasEsp.add("MATO");//3,5 4,5 5,5 5,4*   2
        PalabrasEsp.add("SOLA");//2,3 2,2 3,2 4,2
        PalabrasEsp.add("HORA");//2,2 3,2 3,3 3,4*    4
        //PalabrasEsp.add("");
        //PalabrasEsp.add("");
        //PalabrasEsp.add("");
        //PalabrasEsp.add("");
        //PalabrasEsp.add("");
        //PalabrasEsp.add("");
    }
    //metodo previo a la revision de palabras el la clase jugador
    public boolean evaluar(String palabra,int mapa){
    boolean encontrada=false;
    if(mapa==1){
    if(palabra.equals("CAER"))
        encontrada=true;
    else if(palabra.equals("DONAR"))
        encontrada=true;
        }
    else if(mapa==2){
    if(palabra.equals("MATO"))
        encontrada=true;
    else if(palabra.equals("TENOR"))
        encontrada=true;
        }
    else if(mapa==3){
    if(palabra.equals("MALO"))
        encontrada=true;
    else if(palabra.equals("COLA"))
        encontrada=true;
        }
    else if(mapa==4){
    if(palabra.equals("LEER"))
        encontrada=true;
    else if(palabra.equals("HORA"))
        encontrada=true;
        }
    
    return encontrada;}
    
}
