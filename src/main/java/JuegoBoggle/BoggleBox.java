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
public class BoggleBox {
    //creaccion de los arrays y matrices
    private ArrayList<Dado> PalabrasIng=new ArrayList<Dado>(25);
    String[] letrasIng=new String[] {"QBZJXK","TOUOTO","OVWRGR","AAAFSR","AUMEEG",
                                     "HHLRDO","NHDTHO","LHNROD","AFAISR","YIFASR",
                                     "TELPCI","SSNSEU","RIYPRH","DORDLN","CCWNST",
                                     "TTOTEM","SCTIEP","EANDNN","MNNEAG","UOTOWN",
                                     "AEAEEE","YIFPSR","EEEEMA","ITITIE","ETILIC"};
    char[][] dadosIng=new char[][] {{'Q','B','Z','J','X','K'},{'T','O','U','O','T','O'},{'O','V','W','R','G','R'},{'A','A','A','F','S','R'},{'A','U','M','E','E','G'},
                                    {'H','H','L','R','D','O'},{'N','H','D','T','H','O'},{'L','H','N','R','O','D'},{'A','F','A','I','S','R'},{'Y','I','F','A','S','R'},
                                    {'T','E','L','P','C','I'},{'S','S','N','S','E','U'},{'R','I','Y','P','R','H'},{'D','O','R','D','L','N'},{'C','C','W','N','S','T'},
                                    {'T','T','O','T','E','M'},{'S','C','T','I','E','P'},{'E','A','N','D','N','N'},{'M','N','N','E','A','G'},{'U','O','T','O','W','N'},
                                    {'A','E','A','E','E','E'},{'Y','I','F','P','S','R'},{'E','E','E','E','M','A'},{'I','T','I','T','I','E'},{'E','T','I','L','I','C'}};
    private ArrayList<Dado> PalabrasEsp=new ArrayList<Dado>(25);
    String[] letrasEsp=new String[] {"QBZJXL","TOUOTO","OVCRGR","AAAFSR","AUMEEO",
                                     "EHLRDO","NHDTHO","LHNROD","ADAISR","UIFASR",
                                     "TELPCI","SSNSEU","RIYPRH","DORDLN","CCÑNST",
                                     "TTOTEM","SCTIEP","EANDNN","MNNEAG","UOTOÑN",
                                     "AEAEEH","YIFPSR","EEEEMA","ITATIE","ETILAC"};
    char[][] dadosEsp=new char[][] {{'Q','B','Z','J','X','L'},{'T','O','U','O','T','O'},{'O','V','C','R','G','R'},{'A','A','A','F','S','R'},{'A','U','M','E','E','O'},
                                    {'E','H','L','R','D','O'},{'N','H','D','T','H','O'},{'L','H','N','R','O','D'},{'A','D','A','I','S','R'},{'U','I','F','A','S','R'},
                                    {'T','E','L','P','C','I'},{'S','S','N','S','E','U'},{'R','I','Y','P','R','H'},{'D','O','R','D','L','N'},{'C','C','Ñ','N','S','T'},
                                    {'T','T','O','T','E','M'},{'S','C','T','I','E','P'},{'E','A','N','D','N','N'},{'M','N','N','E','A','G'},{'U','O','T','O','Ñ','N'},
                                    {'A','E','A','E','E','H'},{'Y','I','F','P','S','R'},{'E','E','E','E','M','A'},{'I','T','A','T','I','E'},{'E','T','I','L','A','C'}};
    //asignacion de caracter para la cara de cada dado    
    public BoggleBox(int idioma) {
        
        switch(idioma){
            case 1:
                for(int k=0;k<25;k++){
                    //String letra=letrasIng.get(k);
                    DadoBoggle Ing=new DadoBoggle(dadosIng[k][0],dadosIng[k][1],dadosIng[k][2],dadosIng[k][3],dadosIng[k][4],dadosIng[k][5]);
                            PalabrasIng.add(Ing);
                }
                
                break;
            case 2:
                for(int k=0;k<25;k++){
                    DadoBoggle Esp=new DadoBoggle(dadosEsp[k][0],dadosEsp[k][1],dadosEsp[k][2],dadosEsp[k][3],dadosEsp[k][4],dadosEsp[k][5]);
                            PalabrasEsp.add(Esp);
                }
                break;
               
        }
    }
    //metodo para mostrar tablero en español
    public void Mostrarcaja(int tablero){
        
        if(tablero==1)
            System.out.println((PalabrasEsp.get(0)).getCara1() +" "+(PalabrasEsp.get(1)).getCara1() +" "+(PalabrasEsp.get(2)).getCara3() +" "+(PalabrasEsp.get(3)).getCara2() +" "+(PalabrasEsp.get(4)).getCara4()+"\n"+
                               (PalabrasEsp.get(5)).getCara1() +" "+(PalabrasEsp.get(6)).getCara1() +" "+(PalabrasEsp.get(7)).getCara1() +" "+(PalabrasEsp.get(8)).getCara2() +" "+(PalabrasEsp.get(9)).getCara6()+"\n"+
                               (PalabrasEsp.get(10)).getCara1()+" "+(PalabrasEsp.get(11)).getCara1()+" "+(PalabrasEsp.get(12)).getCara1()+" "+(PalabrasEsp.get(13)).getCara2()+" "+(PalabrasEsp.get(14)).getCara1()+"\n"+
                               (PalabrasEsp.get(15)).getCara6()+" "+(PalabrasEsp.get(16)).getCara1()+" "+(PalabrasEsp.get(17)).getCara2()+" "+(PalabrasEsp.get(18)).getCara3()+" "+(PalabrasEsp.get(19)).getCara1()+"\n"+
                               (PalabrasEsp.get(20)).getCara1()+" "+(PalabrasEsp.get(21)).getCara1()+" "+(PalabrasEsp.get(22)).getCara1()+" "+(PalabrasEsp.get(23)).getCara1()+" "+(PalabrasEsp.get(24)).getCara2()+"\n");
        else if(tablero==2)
            System.out.println((PalabrasEsp.get(0)).getCara6() +" "+(PalabrasEsp.get(1)).getCara2() +" "+(PalabrasEsp.get(2)).getCara6() +" "+(PalabrasEsp.get(3)).getCara2() +" "+(PalabrasEsp.get(4)).getCara5()+"\n"+
                               (PalabrasEsp.get(5)).getCara1() +" "+(PalabrasEsp.get(6)).getCara1() +" "+(PalabrasEsp.get(7)).getCara1() +" "+(PalabrasEsp.get(8)).getCara5() +" "+(PalabrasEsp.get(9)).getCara4()+"\n"+
                               (PalabrasEsp.get(10)).getCara1()+" "+(PalabrasEsp.get(11)).getCara2()+" "+(PalabrasEsp.get(12)).getCara5()+" "+(PalabrasEsp.get(13)).getCara2()+" "+(PalabrasEsp.get(14)).getCara2()+"\n"+
                               (PalabrasEsp.get(15)).getCara6()+" "+(PalabrasEsp.get(16)).getCara5()+" "+(PalabrasEsp.get(17)).getCara2()+" "+(PalabrasEsp.get(18)).getCara6()+" "+(PalabrasEsp.get(19)).getCara4()+"\n"+
                               (PalabrasEsp.get(20)).getCara1()+" "+(PalabrasEsp.get(21)).getCara1()+" "+(PalabrasEsp.get(22)).getCara5()+" "+(PalabrasEsp.get(23)).getCara3()+" "+(PalabrasEsp.get(24)).getCara2()+"\n");
       else if(tablero==3)
            System.out.println((PalabrasEsp.get(0)).getCara1() +" "+(PalabrasEsp.get(1)).getCara2() +" "+(PalabrasEsp.get(2)).getCara3() +" "+(PalabrasEsp.get(3)).getCara6() +" "+(PalabrasEsp.get(4)).getCara4()+"\n"+
                               (PalabrasEsp.get(5)).getCara1() +" "+(PalabrasEsp.get(6)).getCara1() +" "+(PalabrasEsp.get(7)).getCara5() +" "+(PalabrasEsp.get(8)).getCara5() +" "+(PalabrasEsp.get(9)).getCara6()+"\n"+
                               (PalabrasEsp.get(10)).getCara1()+" "+(PalabrasEsp.get(11)).getCara3()+" "+(PalabrasEsp.get(12)).getCara4()+" "+(PalabrasEsp.get(13)).getCara4()+" "+(PalabrasEsp.get(14)).getCara2()+"\n"+
                               (PalabrasEsp.get(15)).getCara6()+" "+(PalabrasEsp.get(16)).getCara1()+" "+(PalabrasEsp.get(17)).getCara2()+" "+(PalabrasEsp.get(18)).getCara3()+" "+(PalabrasEsp.get(19)).getCara4()+"\n"+
                               (PalabrasEsp.get(20)).getCara1()+" "+(PalabrasEsp.get(21)).getCara2()+" "+(PalabrasEsp.get(22)).getCara5()+" "+(PalabrasEsp.get(23)).getCara3()+" "+(PalabrasEsp.get(24)).getCara4()+"\n");
       else if(tablero==4)
            System.out.println((PalabrasEsp.get(0)).getCara3() +" "+(PalabrasEsp.get(1)).getCara6() +" "+(PalabrasEsp.get(2)).getCara3() +" "+(PalabrasEsp.get(3)).getCara2() +" "+(PalabrasEsp.get(4)).getCara4()+"\n"+
                               (PalabrasEsp.get(5)).getCara2() +" "+(PalabrasEsp.get(6)).getCara2() +" "+(PalabrasEsp.get(7)).getCara5() +" "+(PalabrasEsp.get(8)).getCara6() +" "+(PalabrasEsp.get(9)).getCara6()+"\n"+
                               (PalabrasEsp.get(10)).getCara1()+" "+(PalabrasEsp.get(11)).getCara3()+" "+(PalabrasEsp.get(12)).getCara1()+" "+(PalabrasEsp.get(13)).getCara2()+" "+(PalabrasEsp.get(14)).getCara3()+"\n"+
                               (PalabrasEsp.get(15)).getCara6()+" "+(PalabrasEsp.get(16)).getCara5()+" "+(PalabrasEsp.get(17)).getCara2()+" "+(PalabrasEsp.get(18)).getCara3()+" "+(PalabrasEsp.get(19)).getCara1()+"\n"+
                               (PalabrasEsp.get(20)).getCara5()+" "+(PalabrasEsp.get(21)).getCara6()+" "+(PalabrasEsp.get(22)).getCara3()+" "+(PalabrasEsp.get(23)).getCara3()+" "+(PalabrasEsp.get(24)).getCara4()+"\n");
    
    
    
    }
    
    
}
