public class Ram {
    private String tipo;
    private int capacidade;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Ram(String tipo, int capacidade) {
        this.tipo = tipo;
        this.capacidade = capacidade;
    }
    
}
