package poo14;

public class ProjetoBlackjack {

    public static void main(String[] args) {
/*        
        // Conjunto de Testes
        Baralho baralho = new Baralho();
        baralho.listarCartas();
        
        Carta c = new Carta();
        try{
            c.setCarta("5", "Ouros");
        }
        catch(ExcecaoCartaInexistente ex){
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        
        Jogador j1 = new Jogador();
        j1.adicionarCartaSacada(c);
        try{
            c = new Carta();
            c.setCarta("6", "Espadas");
        }
        catch(ExcecaoCartaInexistente ex){
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        
        j1.adicionarCartaSacada(c);
        System.out.println(j1.getPontos() + " pontos.\n");
        
        //Teste baralho
        Baralho b = new Baralho();
        b.embaralhar();
        b.listarCartas();
*/
        //Teste Mesa
        Mesa mesa = new Mesa();
        //mesa.gbaralho.listarCartas();
        mesa.jogar();
        
    }
    
}
