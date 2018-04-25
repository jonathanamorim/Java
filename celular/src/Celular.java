public class Celular {
    private Ram ram;
    private Processador processasdor;
    private Tela tela;
    private Bateria bateria;
    private Camera camera;

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Processador getProcessasdor() {
        return processasdor;
    }

    public void setProcessasdor(Processador processasdor) {
        this.processasdor = processasdor;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
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

    public Celular(Ram ram, Processador processasdor, Tela tela, Bateria bateria, Camera camera) {
        this.ram = ram;
        this.processasdor = processasdor;
        this.tela = tela;
        this.bateria = bateria;
        this.camera = camera;
    }       
}
