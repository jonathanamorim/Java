package javaapplication6;
public class Professor {
    String nome;
    int idade;
    double altura;
    String disciplina;

    void setdisciplina(String d){
        disciplina = d;
    }
    String getdiscilpina(){
        return disciplina;
    }     
    
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
    Professor(String nome,int idade,double altura, String disciplina){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.disciplina = disciplina;
    }
}
