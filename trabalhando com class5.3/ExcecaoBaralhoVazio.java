package poo14;

public class ExcecaoBaralhoVazio extends Exception {

    public ExcecaoBaralhoVazio() {
        super("Baralho Vazio");
    }
    
    @Override
    public String getMessage(){
        return "Baralho Vazio";
    }
}
