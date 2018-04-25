package poo11;

import java.util.ArrayList;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;
    
    Baralho(){
        cartas = new ArrayList<Carta>(); //cria lista para 'cartas'
        
        String numero = "0";
        String naipe = "fake";
        int valor = 0;
        
        for (int num=1; num<14; num++){
            for (int naip=1; naip<5; naip++){
                Carta c = new Carta(); //cria carta
                //verifica numero
                if (num==1){
                    numero="A";
                    valor=1;
                }
                else if (num==11){
                    numero="J";
                    valor=11;
                }
                else if (num==12){
                    numero="Q";
                    valor=12;
                }
                else if (num==13){
                    numero="K";
                    valor=13;
                }
                else{
                    numero = String.valueOf(num);
                    valor = num;
                }
                
                //verifica naipe
                switch (naip) {
                    case 1:  naipe = "Damas"; break;
                    case 2:  naipe = "Paus"; break;
                    case 3:  naipe = "Copas";  break;
                    case 4:  naipe = "Espadas"; break;
                    default: naipe = "fake"; break;
                }
                //seta a carta
                c.setCarta(numero, naipe, valor);
                //Adiciona a carta no baralho
                this.cartas.add(c);
            }
        }
    }
    
    public void listarCartas(){
        for (Carta c : this.cartas) 
            System.out.println(c.getNumero() +" de "+c.getNaipe() +". Valor: "+ c.getValor());
    }
}
