package ab;

import java.util.Scanner;

public class Ab {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int e = 0;
        do {
            System.out.print("1 PARA SOMA OS ANTEC. 2 PARA FATORIAL. 3 PARA SAIR = ");
            e = t.nextByte();
            switch (e) {
                case 1:
                    System.out.print("Digite um numero: ");
                    Scanner fat = new Scanner(System.in);
                    int fat1 = fat.nextInt();
                    int i = fat1 -1;
                    while (fat1>0){
            			fat1=fat1 * i;
            			i--;
                        System.out.println("fatorial e "+fat1);
                    }

                    break;
                case 2:
                    Scanner s = new Scanner(System.in);
                    int num;
                    int soma = 0;
                    int cont = 0;
                    System.out.print("Digite um número inteiro: ");
                    num = s.nextInt();
                    while (num > 0) {
                      soma = soma + num;
                      num--;
                    System.out.println (soma);
                    }
                    break;
                default:
                    
            }
        }while (e!=3);  
    }
}