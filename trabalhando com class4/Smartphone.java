package poo10;

public class Smartphone {

    private String nome;
    private Bateria bateria;
    private Camera camera;
    private Processador processador;
    private Ram ram;
    private Tela tela;

    Smartphone() {
    }

    Smartphone(String n, Bateria b, Camera c, Processador p, Ram r, Tela t) {
        this.nome = n;
        this.bateria = b;
        this.camera = c;
        this.processador = p;
        this.ram = r;
        this.tela = t;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("");
        System.out.println("Smartphone: \n" + this.nome);
        System.out.println("Bateria: " + this.bateria.getCapacidade() + "mAh");
        System.out.println("Câmera: " + this.camera.getResolucao());
        System.out.println("Processador: " + this.processador.getMarca() + " "
                + this.processador.getModelo() + " " + this.processador.getVelocidade() + "GHz");
        System.out.println("RAM: " + this.ram.getTipo() + " " + this.ram.getCapacidade() + "GB");
        System.out.println("Tela: " + this.tela.getTamanho() + " " + this.tela.getResolucao());
    }

}
