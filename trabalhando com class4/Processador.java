package poo10;

public class Processador {
    private String marca;
    private String modelo;
    private String velocidade;
    
    Processador(){}
    
    Processador(String m, String mo, String ve) {
        this.marca=m;
        this.modelo=mo;
        this.velocidade=ve;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }
    
}
