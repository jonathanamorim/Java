package poo14;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> cartasSacadas;
    
    Jogador(){
         cartasSacadas = new ArrayList<Carta>();
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getPontos(){
        int total_pontos = 0;
        for (Carta c : this.cartasSacadas) {
            total_pontos += c.getValor();
        }
        return total_pontos;
    }
    
    public void adicionarCartaSacada(Carta c) {
        cartasSacadas.add(c);
    }
}
