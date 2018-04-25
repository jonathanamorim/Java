package javaapplication6;
public class Aluno {
    String nome;
    int idade;
    double altura;
    Professor tutor1;
    Professor tutor2;
    
    void setnome(String n){
        nome = n;
    }
    String getnome(){
        return nome;
    }
    void setidade(int i){
        idade = i;
    }
    int getidade(){
        return idade;
    }
    void setaltura(double a){
        altura = a;
    }
    double getaltura(){
        return altura;
    }
    void settutor1(Professor tutor){
        this.tutor1 = tutor;
    }
    Professor gettutor1(){
        return tutor1;
    }
    void settutor2(Professor tutor){
        this.tutor2 = tutor;
    }
    Professor gettutor2(){
        return tutor2;
    }
    Aluno(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}
 