package poo10;

public class Tela {
    
    private String tamanho;
    private String resolucao;
    
    Tela(){}
    
    Tela(String t, String r){
        this.tamanho=t;
        this.resolucao=r;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
    
        
}
