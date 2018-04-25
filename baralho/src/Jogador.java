import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private int p;
    private List<Carta> cartasSacadas;
    
    private int getPontos(){
        int p = 0;
        for(Carta b: this.cartasSacadas){
          p = p + b.getValor();
        }           
        return p ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    private void adicionarCartasSacadas(Carta c){
        cartasSacadas.add(c);
    }
    
    Jogador(){
        cartasSacadas = new ArrayList<Carta>();
    }
}
