package poo10;

import java.util.Scanner;

public class POO10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Sala sala = new Sala(); //A sala já tem 30 alunos.
        for (Aluno aluno : sala.alunos) {
            System.out.println("Digite o nome do Alunos: ");
            String nome = leitor.nextLine();
            aluno.setNome(nome);
        }
        System.out.println("Alunos da Turma:");
        for (Aluno aluno : sala.alunos) {
            System.out.println(aluno.getNome());
        }
    }

}
