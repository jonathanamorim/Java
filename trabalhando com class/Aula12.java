package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Macarrao m = new Macarrao();
        m.nome="Espaguete Instantáneo";
        m.marca="Nissin";
        m.preco=(float) 1.90;
        m.dv="21/07/2019";
        m.peso_liq="500g";
        m.cat=Categoria.alimentacao;
        System.out.println(m.nome);
        
        Sabonete s = new Sabonete();
        s.nome="Flor";
        s.marca="Ypê";
        s.preco=(float) 0.90;
        s.peso_liq="90g";
        s.cat=Categoria.limpeza;
        System.out.println(s.nome);
        
        Remedio r = new Remedio();
        r.nome="Clarilerg";
        r.rotulo="loratadina";
        r.preco=(float) 2.49;
        r.peso_liq="10mg";
        System.out.println(r.nome);
        
    }
    
}
