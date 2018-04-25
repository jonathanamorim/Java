package poo10;

public class SerHumano {

    public String corOlhos;
    public float altura;
    public float peso;

    public SerHumano() {
    }

    public SerHumano(String corOlhos, float altura, float peso) {
        this.corOlhos = corOlhos;
        this.altura = altura;
        this.peso = peso;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void locomover_lento() {
        System.out.println("Se locomovendo a pé");
    }

    public void locomover_rapido() {
        System.out.println("Nao possui!");
    }

}
