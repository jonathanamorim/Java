package poo10;

public class Ram {
    
    private String tipo;
    private String capacidade;
    
    Ram(){}
    
    Ram(String t, String c){
        this.tipo=t;
        this.capacidade=c;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
    
    
    
}
