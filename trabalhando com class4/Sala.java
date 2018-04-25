package poo10;

import java.util.ArrayList;
import java.util.List;

public class Sala {

    public List<Aluno> alunos;

    public Sala() {

        alunos = new ArrayList<Aluno>();
        for (int i = 0; i < 30; i++) {
            Aluno a = new Aluno();
            alunos.add(a);
        }

    }
}
