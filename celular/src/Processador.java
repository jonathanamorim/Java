public class Processador {
    private String marca;
    private String modelo;
    private double velo;

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

    public double getVelo() {
        return velo;
    }

    public void setVelo(double velo) {
        this.velo = velo;
    }

    public Processador(String marca, String modelo, double velo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velo = velo;
    }

    
}
