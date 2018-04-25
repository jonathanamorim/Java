package aulas;

public class Aulas {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c;
        for (int o = 0;o < 10;o++) {
            System.out.println(a);
            c = a;
            a = a + b;
            b = c;
        }
    } 
}