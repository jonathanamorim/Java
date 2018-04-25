package poo13;

import java.util.Scanner;

public class Mesa {
    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baralho;
    
    Mesa(){
        jogador1 = new Jogador();
        jogador1.setNome("Jogador 1");
        jogador2 = new Jogador();
        jogador2.setNome("Jogador 2");
        baralho = new Baralho();
    }
    
    private void mostrarPlacar(){
        System.out.println("Jogador1: "+this.jogador1.getPontos());
        System.out.println("Jogador2: "+this.jogador2.getPontos());
    }
    
}
