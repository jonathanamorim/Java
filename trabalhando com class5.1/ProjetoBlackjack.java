package poo12;

public class ProjetoBlackjack {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.listarCartas();
        
        Carta c = new Carta();
        try{
            c.setCarta("1", "Ouros");
        }
        catch(ExcecaoCartaInexistente ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
