package javaapplication6;
public class JavaApplication6 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("José",15,1.7);
        Aluno a2 = new Aluno("Jonathan",12,12.3);
        Aluno a3 = new Aluno("Marta",32,31);
        Aluno a4 = new Aluno("Caique",12,11);
        Professor p1 = new Professor("Maria",45,1.8,"web");
        a1.settutor1(p1);
        a2.settutor1(p1);
        a3.settutor1(p1);
        a4.settutor1(p1);
        Professor p2 = new Professor("Eduardo",37,1.7,"eletronica");
        a1.settutor2(p2);
        a2.settutor2(p2);
        a3.settutor2(p2);
        a4.settutor2(p2);
        
        System.out.println("Meu nome é " +a1.getnome()+ " e estudo "+a1.gettutor2().getdiscilpina()+ " com " + a1.gettutor2().getnome());
        System.out.println("Meu nome é " +a2.getnome()+ " e estudo "+a2.gettutor2().getdiscilpina()+" com " + a2.gettutor2().getnome());
        System.out.println("Meu nome é " +a3.getnome()+ " e estudo "+a3.gettutor1().getdiscilpina()+" com " + a3.gettutor1().getnome());
        System.out.println("Meu nome é " +a4.getnome()+ " e estudo "+a4.gettutor1().getdiscilpina()+" com " + a4.gettutor1().getnome());
        //metodo foi um para todos porque foi um professor para dois alunos
    }
    
}
