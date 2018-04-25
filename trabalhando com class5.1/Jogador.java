package poo12;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> cartasSacadas;
    
    Jogador(){
         cartasSacadas = new ArrayList<Carta>();
    }
}
