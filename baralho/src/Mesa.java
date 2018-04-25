public class Mesa {
    private Jogador j1;
    private Jogador j2;
    private Baralho b;

    public Mesa() throws ExcecaoCartaInexistente {
        j1 = new Jogador();
        j2 = new Jogador();
        b = new Baralho();
    }
    
    public void jogar(){
        
    }
}
