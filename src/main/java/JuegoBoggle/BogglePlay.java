/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoBoggle;

import java.util.Scanner;
import java.util.HashSet;
 /*
 * @author Jesus Andres
 */
public class BogglePlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BogglePlay ejecutar= new BogglePlay();
                ejecutar.Ejecucion();
    }
    
    public static int EscogerIdioma(){
    int idioma=0;
    System.out.println("Bienvenido al juego boggle-Welcome to the boggle game");
    boolean valido;
    do{
    System.out.println("\nSeleccione el idioma-Select language "
                + "\n1. English"
                + "\n2. Español");
        
        Scanner sc = new Scanner(System.in);
        idioma = sc.nextInt();
        if(idioma==1 || idioma==2)
            valido=true;
        else {
            valido=false;
            System.out.println("\nLa opcion seleccionada no es valida, "
                    + "por favor ingrese un valor valido");
        }
    }
    while(!valido);
    return idioma;}
    /*Metodo para la ejecucion del programa, utiliza los distintos metodos
    proporcionados por otras clases para que el funcionamiento sea el correcto
    ademas de administrar los datos que resive para mostrarlos en pantalla
    */
    public void Ejecucion(){
    int puntos=0;
        HashSet<String> palabras = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        DiccionarioBoggle di=new DiccionarioBoggle();
        Jugador jugador=new Jugador();
        BoggleBox caja=new BoggleBox(EscogerIdioma());
        
        caja.Mostrarcaja(1);
        System.out.println("\nIngrese la palabra encontrada");
        String palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,1)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos"); palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        String desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        caja.Mostrarcaja(1);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,1)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        caja.Mostrarcaja(1);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,1)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
       
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        
        caja.Mostrarcaja(2);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        
        caja.Mostrarcaja(2);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){    
            
        caja.Mostrarcaja(2);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        
        caja.Mostrarcaja(2);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){        
            
        caja.Mostrarcaja(2);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        
        caja.Mostrarcaja(2);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){         
            
            
        caja.Mostrarcaja(2);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        
        
        caja.Mostrarcaja(3);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        
        caja.Mostrarcaja(3);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){    
            
        caja.Mostrarcaja(3);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){    
            
        caja.Mostrarcaja(3);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){    
        
        caja.Mostrarcaja(3);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        
        caja.Mostrarcaja(4);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
        
        caja.Mostrarcaja(4);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){    
        
        caja.Mostrarcaja(4);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nDesea seguir jugando? ");
        desicion = sc.nextLine();
        if(desicion.equals("SI") || desicion.equals("Si") || desicion.equals("si")){
            
            
        caja.Mostrarcaja(4);
        System.out.println("\nIngrese la palabra encontrada");
        palabra = sc.nextLine();
        if(jugador.ingresarPalabra(palabra,2)) {puntos=puntos+5; System.out.println("\nSe sumo 5 puntos");palabras.add(palabra);}
        
        System.out.println("\nFin del juego");
        
        }}}}}}}}}}}}}}}}}}
        //se muestran los puntos obtenidos y palabras correctas
        System.out.println("\nEl jugador obtuvo "+puntos+" puntos\n Las palabras ingresadas son las siguientes");
        System.out.println("\n"+palabras);
    
    }
    
    
}
