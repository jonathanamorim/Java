package poo11;

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
    
    public void setCarta(String numero_, String naipe_, int valor_){
        this.numero = numero_;
        this.naipe = naipe_;
        this.valor = valor_;
        
        //tratar excessão
    }
}
