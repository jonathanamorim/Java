package poo14;

public class Carta {
    private String numero;
    private String naipe;
    private int valor;
    
    Carta(){
        this.numero="0";
        this.naipe="fake";
        this.valor=0;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public String getNaipe(){
        return this.naipe;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setCarta(String numero_, String naipe_) throws ExcecaoCartaInexistente  {
        if (!numero_.equals("A") && !numero_.equals("2") && !numero_.equals("3") && !numero_.equals("4") && !numero_.equals("5") && !numero_.equals("6") && !numero_.equals("7") && !numero_.equals("8") && !numero_.equals("9") && !numero_.equals("10") && !numero_.equals("J") && !numero_.equals("Q") && !numero_.equals("K") ){
            throw new ExcecaoCartaInexistente();
        }

        if (!naipe_.equals("Paus") && !naipe_.equals("Ouros") && !naipe_.equals("Copas") && !naipe_.equals("Espadas")){
            throw new ExcecaoCartaInexistente();
        }
        
        this.numero = numero_;
        this.naipe = naipe_;
        if (numero_.equals("A")){
            this.valor=1;
        }
        else if (numero_.equals("J") || numero_.equals("Q") || numero_.equals("K")){
            this.valor=10;
        }
        else{
            this.valor=Integer.parseInt(numero_);
        }

        
        //tratar excessão
    }
}
