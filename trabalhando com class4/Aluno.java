package poo10;

public class Aluno extends SerHumano {

    public String nome;
    public Smartphone celular;

    public Aluno() {
    }

    public Aluno(String corOlhos, float altura, float peso, String nome, Smartphone cel) {
        super(corOlhos, altura, peso);
        this.nome = nome;
        this.celular = cel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Smartphone getCelular() {
        return celular;
    }

    public void setCelular(Smartphone celular) {
        this.celular = celular;
    }

    @Override
    public void locomover_rapido() {
        System.out.println("Se locomovendo de Autómovel...");
    }
}
