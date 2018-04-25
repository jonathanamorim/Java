package javaapplication6;
public class JavaApplication6 {

    public static void main(String[] args) {
        System.out.println("O que são os contrutores nas classes Java o que faz o operador new?");
        System.out.println("Ele inicializa o novo objeto e seus atributos, criam todos os outros objetos de que esse objeto necessita e realizam todas as outras operações de que ele precisa para ser inicializado.");
        System.out.println("");               
        Pessoa p1 = new Pessoa("Ana",32,63.7);
        Pessoa p2 = new Pessoa("Carlos",43,67.4);
        Pessoa p3 = new Pessoa("Lílian",23,50.6);
        System.out.println("Olá meu nome é "+p1.getnome()+" tenho "+p1.getidade()+" anos e peso "+p1.getpeso()+" quilos");
        System.out.println("Olá meu nome é "+p2.getnome()+" tenho "+p2.getidade()+" anos e peso "+p2 .getpeso()+" quilos");
        System.out.println("Olá meu nome é "+p3.getnome()+" tenho "+p3.getidade()+" anos e peso "+p3.getpeso()+" quilos");    
    }
    
}
